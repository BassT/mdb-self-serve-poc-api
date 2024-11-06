package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"actions","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Privileges implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> actions;

    public java.util.List<String> getActions() {
        return actions;
    }

    public void setActions(java.util.List<String> actions) {
        this.actions = actions;
    }

    /**
     * Resource specifies specifies the resources upon which a privilege permits actions.
     * See https://www.mongodb.com/docs/manual/reference/resource-document for more.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource specifies specifies the resources upon which a privilege permits actions.\nSee https://www.mongodb.com/docs/manual/reference/resource-document for more.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.privileges.Resource resource;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.privileges.Resource getResource() {
        return resource;
    }

    public void setResource(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.roles.privileges.Resource resource) {
        this.resource = resource;
    }
}

