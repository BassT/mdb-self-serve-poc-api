package com.mongodb.mongodbcommunity.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"currentMongoDBArbiters","currentMongoDBMembers","currentStatefulSetArbitersReplicas","currentStatefulSetReplicas","message","mongoUri","phase","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MongoDBCommunityStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("currentMongoDBArbiters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long currentMongoDBArbiters;

    public Long getCurrentMongoDBArbiters() {
        return currentMongoDBArbiters;
    }

    public void setCurrentMongoDBArbiters(Long currentMongoDBArbiters) {
        this.currentMongoDBArbiters = currentMongoDBArbiters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentMongoDBMembers")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long currentMongoDBMembers;

    public Long getCurrentMongoDBMembers() {
        return currentMongoDBMembers;
    }

    public void setCurrentMongoDBMembers(Long currentMongoDBMembers) {
        this.currentMongoDBMembers = currentMongoDBMembers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentStatefulSetArbitersReplicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long currentStatefulSetArbitersReplicas;

    public Long getCurrentStatefulSetArbitersReplicas() {
        return currentStatefulSetArbitersReplicas;
    }

    public void setCurrentStatefulSetArbitersReplicas(Long currentStatefulSetArbitersReplicas) {
        this.currentStatefulSetArbitersReplicas = currentStatefulSetArbitersReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentStatefulSetReplicas")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long currentStatefulSetReplicas;

    public Long getCurrentStatefulSetReplicas() {
        return currentStatefulSetReplicas;
    }

    public void setCurrentStatefulSetReplicas(Long currentStatefulSetReplicas) {
        this.currentStatefulSetReplicas = currentStatefulSetReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mongoUri")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mongoUri;

    public String getMongoUri() {
        return mongoUri;
    }

    public void setMongoUri(String mongoUri) {
        this.mongoUri = mongoUri;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

