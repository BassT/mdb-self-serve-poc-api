package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metricsPath","passwordSecretRef","port","tlsSecretKeyRef","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Prometheus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Indicates path to the metrics endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsPath")
    // @io.fabric8.generator.annotation.Pattern("^\\/[a-z0-9]+$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates path to the metrics endpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String metricsPath;

    public String getMetricsPath() {
        return metricsPath;
    }

    public void setMetricsPath(String metricsPath) {
        this.metricsPath = metricsPath;
    }

    /**
     * Name of a Secret containing a HTTP Basic Auth Password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretRef")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of a Secret containing a HTTP Basic Auth Password.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.PasswordSecretRef passwordSecretRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.PasswordSecretRef getPasswordSecretRef() {
        return passwordSecretRef;
    }

    public void setPasswordSecretRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.PasswordSecretRef passwordSecretRef) {
        this.passwordSecretRef = passwordSecretRef;
    }

    /**
     * Port where metrics endpoint will bind to. Defaults to 9216.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port where metrics endpoint will bind to. Defaults to 9216.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * Name of a Secret (type kubernetes.io/tls) holding the certificates to use in the
     * Prometheus endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSecretKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of a Secret (type kubernetes.io/tls) holding the certificates to use in the\nPrometheus endpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.TlsSecretKeyRef tlsSecretKeyRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.TlsSecretKeyRef getTlsSecretKeyRef() {
        return tlsSecretKeyRef;
    }

    public void setTlsSecretKeyRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.prometheus.TlsSecretKeyRef tlsSecretKeyRef) {
        this.tlsSecretKeyRef = tlsSecretKeyRef;
    }

    /**
     * HTTP Basic Auth Username for metrics endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTP Basic Auth Username for metrics endpoint.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

