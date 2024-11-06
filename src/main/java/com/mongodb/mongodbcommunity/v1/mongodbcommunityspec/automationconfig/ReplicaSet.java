package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"settings"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ReplicaSet implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * MapWrapper is a wrapper for a map to be used by other structs.
     * The CRD generator does not support map[string]interface{}
     * on the top level and hence we need to work around this with
     * a wrapping struct.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("settings")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MapWrapper is a wrapper for a map to be used by other structs.\nThe CRD generator does not support map[string]interface{}\non the top level and hence we need to work around this with\na wrapping struct.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.replicaset.Settings settings;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.replicaset.Settings getSettings() {
        return settings;
    }

    public void setSettings(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.replicaset.Settings settings) {
        this.settings = settings;
    }
}

