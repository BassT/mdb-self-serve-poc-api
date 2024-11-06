package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"additionalConnectionStringConfig","connectionStringSecretName","connectionStringSecretNamespace","db","name","passwordSecretRef","roles","scramCredentialsSecretName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class User implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional options to be appended to the connection string.
     * These options apply only to this user and will override any existing options in the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalConnectionStringConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional options to be appended to the connection string.\nThese options apply only to this user and will override any existing options in the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    // @io.fabric8.generator.annotation.Nullable()
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.AdditionalConnectionStringConfig additionalConnectionStringConfig;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.AdditionalConnectionStringConfig getAdditionalConnectionStringConfig() {
        return additionalConnectionStringConfig;
    }

    public void setAdditionalConnectionStringConfig(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.AdditionalConnectionStringConfig additionalConnectionStringConfig) {
        this.additionalConnectionStringConfig = additionalConnectionStringConfig;
    }

    /**
     * ConnectionStringSecretName is the name of the secret object created by the operator which exposes the connection strings for the user.
     * If provided, this secret must be different for each user in a deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStringSecretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConnectionStringSecretName is the name of the secret object created by the operator which exposes the connection strings for the user.\nIf provided, this secret must be different for each user in a deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connectionStringSecretName;

    public String getConnectionStringSecretName() {
        return connectionStringSecretName;
    }

    public void setConnectionStringSecretName(String connectionStringSecretName) {
        this.connectionStringSecretName = connectionStringSecretName;
    }

    /**
     * ConnectionStringSecretNamespace is the namespace of the secret object created by the operator which exposes the connection strings for the user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStringSecretNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConnectionStringSecretNamespace is the namespace of the secret object created by the operator which exposes the connection strings for the user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String connectionStringSecretNamespace;

    public String getConnectionStringSecretNamespace() {
        return connectionStringSecretNamespace;
    }

    public void setConnectionStringSecretNamespace(String connectionStringSecretNamespace) {
        this.connectionStringSecretNamespace = connectionStringSecretNamespace;
    }

    /**
     * DB is the database the user is stored in. Defaults to "admin"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("db")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DB is the database the user is stored in. Defaults to \"admin\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String db = "admin";

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    /**
     * Name is the username of the user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the username of the user")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * PasswordSecretRef is a reference to the secret containing this user's password
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PasswordSecretRef is a reference to the secret containing this user's password")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.PasswordSecretRef passwordSecretRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.PasswordSecretRef getPasswordSecretRef() {
        return passwordSecretRef;
    }

    public void setPasswordSecretRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.PasswordSecretRef passwordSecretRef) {
        this.passwordSecretRef = passwordSecretRef;
    }

    /**
     * Roles is an array of roles assigned to this user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Roles is an array of roles assigned to this user")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.Role> roles;

    public java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.Role> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.users.Role> roles) {
        this.roles = roles;
    }

    /**
     * ScramCredentialsSecretName appended by string "scram-credentials" is the name of the secret object created by the mongoDB operator for storing SCRAM credentials
     * These secrets names must be different for each user in a deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scramCredentialsSecretName")
    // @io.fabric8.generator.annotation.Pattern("^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ScramCredentialsSecretName appended by string \"scram-credentials\" is the name of the secret object created by the mongoDB operator for storing SCRAM credentials\nThese secrets names must be different for each user in a deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scramCredentialsSecretName;

    public String getScramCredentialsSecretName() {
        return scramCredentialsSecretName;
    }

    public void setScramCredentialsSecretName(String scramCredentialsSecretName) {
        this.scramCredentialsSecretName = scramCredentialsSecretName;
    }
}

