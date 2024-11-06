package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"processes","replicaSet"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AutomationConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("processes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.Processes> processes;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.Processes> getProcesses() {
        return processes;
    }

    public void setProcesses(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.Processes> processes) {
        this.processes = processes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicaSet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.ReplicaSet replicaSet;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.ReplicaSet getReplicaSet() {
        return replicaSet;
    }

    public void setReplicaSet(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.ReplicaSet replicaSet) {
        this.replicaSet = replicaSet;
    }
}

