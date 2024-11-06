package com.mongodb.mongodbcommunity.v1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1", storage = true, served = true)
@io.fabric8.kubernetes.model.annotation.Group("mongodbcommunity.mongodb.com")
@io.fabric8.kubernetes.model.annotation.Singular("mongodbcommunity")
@io.fabric8.kubernetes.model.annotation.Plural("mongodbcommunity")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MongoDBCommunity extends
        io.fabric8.kubernetes.client.CustomResource<com.mongodb.mongodbcommunity.v1.MongoDBCommunitySpec, com.mongodb.mongodbcommunity.v1.MongoDBCommunityStatus>
        implements io.fabric8.kubernetes.api.model.Namespaced {
}
