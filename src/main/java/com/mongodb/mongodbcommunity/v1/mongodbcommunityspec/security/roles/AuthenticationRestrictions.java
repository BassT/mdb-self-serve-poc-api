package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientSource","serverAddress"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AuthenticationRestrictions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clientSource")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> clientSource;

    public java.util.List<String> getClientSource() {
        return clientSource;
    }

    public void setClientSource(java.util.List<String> clientSource) {
        this.clientSource = clientSource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serverAddress")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> serverAddress;

    public java.util.List<String> getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(java.util.List<String> serverAddress) {
        this.serverAddress = serverAddress;
    }
}

