package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class StatefulSet implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * StatefulSetMetadataWrapper is a wrapper around Labels and Annotations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StatefulSetMetadataWrapper is a wrapper around Labels and Annotations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Metadata metadata;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Metadata metadata) {
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Spec spec;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Spec getSpec() {
        return spec;
    }

    public void setSpec(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.statefulset.Spec spec) {
        this.spec = spec;
    }
}

