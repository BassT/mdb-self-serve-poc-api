package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"disabled","logRotate","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Processes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disabled;

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * CrdLogRotate is the crd definition of LogRotate including fields in strings while the agent supports them as float64
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRotate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CrdLogRotate is the crd definition of LogRotate including fields in strings while the agent supports them as float64")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.processes.LogRotate logRotate;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.processes.LogRotate getLogRotate() {
        return logRotate;
    }

    public void setLogRotate(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.processes.LogRotate logRotate) {
        this.logRotate = logRotate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

