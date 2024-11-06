package com.mongodb.mongodbcommunity.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additionalConnectionStringConfig","additionalMongodConfig","agent","arbiters","automationConfig","featureCompatibilityVersion","memberConfig","members","prometheus","replicaSetHorizons","security","statefulSet","type","users","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MongoDBCommunitySpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional options to be appended to the connection string. These options apply to the entire resource and to each user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalConnectionStringConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional options to be appended to the connection string. These options apply to the entire resource and to each user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    // @io.fabric8.generator.annotation.Nullable()
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalConnectionStringConfig additionalConnectionStringConfig;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalConnectionStringConfig getAdditionalConnectionStringConfig() {
        return additionalConnectionStringConfig;
    }

    public void setAdditionalConnectionStringConfig(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalConnectionStringConfig additionalConnectionStringConfig) {
        this.additionalConnectionStringConfig = additionalConnectionStringConfig;
    }

    /**
     * AdditionalMongodConfig is additional configuration that can be passed to
     * each data-bearing mongod at runtime. Uses the same structure as the mongod
     * configuration file: https://www.mongodb.com/docs/manual/reference/configuration-options/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMongodConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AdditionalMongodConfig is additional configuration that can be passed to\neach data-bearing mongod at runtime. Uses the same structure as the mongod\nconfiguration file: https://www.mongodb.com/docs/manual/reference/configuration-options/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    // @io.fabric8.generator.annotation.Nullable()
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalMongodConfig additionalMongodConfig;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalMongodConfig getAdditionalMongodConfig() {
        return additionalMongodConfig;
    }

    public void setAdditionalMongodConfig(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AdditionalMongodConfig additionalMongodConfig) {
        this.additionalMongodConfig = additionalMongodConfig;
    }

    /**
     * AgentConfiguration sets options for the MongoDB automation agent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AgentConfiguration sets options for the MongoDB automation agent")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Agent agent;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Agent getAgent() {
        return agent;
    }

    public void setAgent(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Agent agent) {
        this.agent = agent;
    }

    /**
     * Arbiters is the number of arbiters to add to the Replica Set.
     * It is not recommended to have more than one arbiter per Replica Set.
     * More info: https://www.mongodb.com/docs/manual/tutorial/add-replica-set-arbiter/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arbiters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Arbiters is the number of arbiters to add to the Replica Set.\nIt is not recommended to have more than one arbiter per Replica Set.\nMore info: https://www.mongodb.com/docs/manual/tutorial/add-replica-set-arbiter/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long arbiters;

    public Long getArbiters() {
        return arbiters;
    }

    public void setArbiters(Long arbiters) {
        this.arbiters = arbiters;
    }

    /**
     * AutomationConfigOverride is merged on top of the operator created automation config. Processes are merged
     * by name. Currently Only the process.disabled field is supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("automationConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutomationConfigOverride is merged on top of the operator created automation config. Processes are merged\nby name. Currently Only the process.disabled field is supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AutomationConfig automationConfig;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AutomationConfig getAutomationConfig() {
        return automationConfig;
    }

    public void setAutomationConfig(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.AutomationConfig automationConfig) {
        this.automationConfig = automationConfig;
    }

    /**
     * FeatureCompatibilityVersion configures the feature compatibility version that will
     * be set for the deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("featureCompatibilityVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FeatureCompatibilityVersion configures the feature compatibility version that will\nbe set for the deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String featureCompatibilityVersion;

    public String getFeatureCompatibilityVersion() {
        return featureCompatibilityVersion;
    }

    public void setFeatureCompatibilityVersion(String featureCompatibilityVersion) {
        this.featureCompatibilityVersion = featureCompatibilityVersion;
    }

    /**
     * MemberConfig
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memberConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MemberConfig")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.MemberConfig> memberConfig;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.MemberConfig> getMemberConfig() {
        return memberConfig;
    }

    public void setMemberConfig(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.MemberConfig> memberConfig) {
        this.memberConfig = memberConfig;
    }

    /**
     * Members is the number of members in the replica set
     */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Members is the number of members in the replica set")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long members;

    public Long getMembers() {
        return members;
    }

    public void setMembers(Long members) {
        this.members = members;
    }

    /**
     * Prometheus configurations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prometheus configurations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Prometheus prometheus;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Prometheus getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Prometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * ReplicaSetHorizons Add this parameter and values if you need your database
     * to be accessed outside of Kubernetes. This setting allows you to
     * provide different DNS settings within the Kubernetes cluster and
     * to the Kubernetes cluster. The Kubernetes Operator uses split horizon
     * DNS for replica set members. This feature allows communication both
     * within the Kubernetes cluster and from outside Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaSetHorizons")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReplicaSetHorizons Add this parameter and values if you need your database\nto be accessed outside of Kubernetes. This setting allows you to\nprovide different DNS settings within the Kubernetes cluster and\nto the Kubernetes cluster. The Kubernetes Operator uses split horizon\nDNS for replica set members. This feature allows communication both\nwithin the Kubernetes cluster and from outside Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<java.util.Map<java.lang.String, String>> replicaSetHorizons;

    public java.util.List<java.util.Map<java.lang.String, String>> getReplicaSetHorizons() {
        return replicaSetHorizons;
    }

    public void setReplicaSetHorizons(java.util.List<java.util.Map<java.lang.String, String>> replicaSetHorizons) {
        this.replicaSetHorizons = replicaSetHorizons;
    }

    /**
     * Security configures security features, such as TLS, and authentication settings for a deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Security configures security features, such as TLS, and authentication settings for a deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Security security;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Security getSecurity() {
        return security;
    }

    public void setSecurity(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.Security security) {
        this.security = security;
    }

    /**
     * StatefulSetConfiguration holds the optional custom StatefulSet
     * that should be merged into the operator created one.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statefulSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StatefulSetConfiguration holds the optional custom StatefulSet\nthat should be merged into the operator created one.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.StatefulSet statefulSet;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.StatefulSet getStatefulSet() {
        return statefulSet;
    }

    public void setStatefulSet(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.StatefulSet statefulSet) {
        this.statefulSet = statefulSet;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("ReplicaSet")
        REPLICASET("ReplicaSet");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Type defines which type of MongoDB deployment the resource should create
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type defines which type of MongoDB deployment the resource should create")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Users specifies the MongoDB users that should be configured in your deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("users")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Users specifies the MongoDB users that should be configured in your deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.User> users;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.User> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.User> users) {
        this.users = users;
    }

    /**
     * Version defines which version of MongoDB will be used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version defines which version of MongoDB will be used")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

