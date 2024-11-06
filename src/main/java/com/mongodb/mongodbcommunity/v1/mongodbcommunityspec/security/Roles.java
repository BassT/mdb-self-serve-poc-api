package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationRestrictions","db","privileges","role","roles"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Roles implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The authentication restrictions the server enforces on the role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationRestrictions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The authentication restrictions the server enforces on the role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.AuthenticationRestrictions> authenticationRestrictions;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.AuthenticationRestrictions> getAuthenticationRestrictions() {
        return authenticationRestrictions;
    }

    public void setAuthenticationRestrictions(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.AuthenticationRestrictions> authenticationRestrictions) {
        this.authenticationRestrictions = authenticationRestrictions;
    }

    /**
     * The database of the role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("db")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The database of the role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String db;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    /**
     * The privileges to grant the role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileges")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The privileges to grant the role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Privileges> privileges;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Privileges> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Privileges> privileges) {
        this.privileges = privileges;
    }

    /**
     * The name of the role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * An array of roles from which this role inherits privileges.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An array of roles from which this role inherits privileges.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Roles> roles;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Roles> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.Roles> roles) {
        this.roles = roles;
    }
}

