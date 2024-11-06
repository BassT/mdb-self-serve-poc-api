package com.example;

import java.util.HashMap;
import java.util.List;

import com.mongodb.mongodbcommunity.v1.MongoDBCommunity;
import com.mongodb.mongodbcommunity.v1.MongoDBCommunitySpec;
import com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Security;
import com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.User;
import com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Authentication;
import com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.PasswordSecretRef;
import com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.Role;

import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/clusters")
public class ClusterResource {
    private final KubernetesClient kubernetesClient;
    private final MixedOperation<MongoDBCommunity, KubernetesResourceList<MongoDBCommunity>, Resource<MongoDBCommunity>> mongodbCommunityClient;
    private final ClusterRepository clusterRepository;

    public ClusterResource(KubernetesClient kubernetesClient, ClusterRepository clusterRepository) {
        this.kubernetesClient = kubernetesClient;
        this.mongodbCommunityClient = this.kubernetesClient
                .resources(MongoDBCommunity.class);
        this.clusterRepository = clusterRepository;
    }

    @GET
    public List<ClusterEntity> getClusters() {
        List<ClusterEntity> clusters = clusterRepository.get();
        for (ClusterEntity cluster : clusters) {
            MongoDBCommunity mdb = this.mongodbCommunityClient.inNamespace("default").withName(cluster.name).get();
            cluster.status = new ClusterStatus(mdb.getStatus().getMessage(), mdb.getStatus().getPhase());
        }
        return clusters;
    }

    @POST
    public String createCluster(ClusterEntity cluster) {
        String clusterId = clusterRepository.add(cluster);
        createMongoDB(cluster);
        return clusterId;
    }

    private MongoDBCommunity createMongoDB(ClusterEntity cluster) {
        // Construct user password secret
        String passwordSecretName = cluster.name + "-user-password-secret";
        Secret passwordSecret = new Secret();
        passwordSecret.setMetadata(new ObjectMetaBuilder().withName(passwordSecretName).build());
        passwordSecret.setType("Opaque");
        HashMap<String, String> stringData = new HashMap<String, String>();
        stringData.put("password", "testtest");
        passwordSecret.setStringData(stringData);

        this.kubernetesClient.secrets().resource(passwordSecret).create();

        // Construct security and authentication MongoDB spec
        Authentication auth = new Authentication();
        auth.setModes(List.of(Authentication.Modes.SCRAM));
        Security security = new Security();
        security.setAuthentication(auth);

        // Construct database users
        User user = new User();
        user.setName("test");
        user.setDb("admin");
        PasswordSecretRef passwordRef = new PasswordSecretRef();
        passwordRef.setName(passwordSecretName);
        user.setPasswordSecretRef(passwordRef);
        Role readWriteAnyRole = new Role();
        readWriteAnyRole.setDb("admin");
        readWriteAnyRole.setName("readWriteAnyDatabase");
        user.setRoles(List.of(readWriteAnyRole));
        user.setScramCredentialsSecretName(cluster.name + "-test-user");

        // Construct MongoDB spec
        MongoDBCommunitySpec mdbSpec = new MongoDBCommunitySpec();
        mdbSpec.setMembers(1L);
        mdbSpec.setType(MongoDBCommunitySpec.Type.REPLICASET);
        mdbSpec.setVersion("6.0.5");
        mdbSpec.setSecurity(security);
        mdbSpec.setUsers(List.of(user));

        // Construct MongoDB resource
        MongoDBCommunity mdb = new MongoDBCommunity();
        mdb.setMetadata(new ObjectMetaBuilder().withName(cluster.name).build());
        mdb.setSpec(mdbSpec);

        return mongodbCommunityClient.inNamespace("default").resource(mdb).create();
    }
}
