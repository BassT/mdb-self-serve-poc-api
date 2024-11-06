package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"key","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PasswordSecretRef implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Key is the key in the secret storing this password. Defaults to "password"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Key is the key in the secret storing this password. Defaults to \"password\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Name is the name of the secret storing this user's password
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the secret storing this user's password")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

