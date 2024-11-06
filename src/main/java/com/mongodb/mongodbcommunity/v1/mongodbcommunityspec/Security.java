package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","roles","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Security implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Authentication authentication;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * User-specified custom MongoDB roles that should be configured in the deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("User-specified custom MongoDB roles that should be configured in the deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Roles> roles;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Roles> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Roles> roles) {
        this.roles = roles;
    }

    /**
     * TLS configuration for both client-server and server-server communication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS configuration for both client-server and server-server communication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Tls tls;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Tls getTls() {
        return tls;
    }

    public void setTls(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.Tls tls) {
        this.tls = tls;
    }
}

