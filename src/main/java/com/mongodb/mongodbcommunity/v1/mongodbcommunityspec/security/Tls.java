package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"caCertificateSecretRef","caConfigMapRef","certificateKeySecretRef","enabled","optional"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CaCertificateSecret is a reference to a Secret containing the certificate for the CA which signed the server certificates
     * The certificate is expected to be available under the key "ca.crt"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificateSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CaCertificateSecret is a reference to a Secret containing the certificate for the CA which signed the server certificates\nThe certificate is expected to be available under the key \"ca.crt\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaCertificateSecretRef caCertificateSecretRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaCertificateSecretRef getCaCertificateSecretRef() {
        return caCertificateSecretRef;
    }

    public void setCaCertificateSecretRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaCertificateSecretRef caCertificateSecretRef) {
        this.caCertificateSecretRef = caCertificateSecretRef;
    }

    /**
     * CaConfigMap is a reference to a ConfigMap containing the certificate for the CA which signed the server certificates
     * The certificate is expected to be available under the key "ca.crt"
     * This field is ignored when CaCertificateSecretRef is configured
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caConfigMapRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CaConfigMap is a reference to a ConfigMap containing the certificate for the CA which signed the server certificates\nThe certificate is expected to be available under the key \"ca.crt\"\nThis field is ignored when CaCertificateSecretRef is configured")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaConfigMapRef caConfigMapRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaConfigMapRef getCaConfigMapRef() {
        return caConfigMapRef;
    }

    public void setCaConfigMapRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CaConfigMapRef caConfigMapRef) {
        this.caConfigMapRef = caConfigMapRef;
    }

    /**
     * CertificateKeySecret is a reference to a Secret containing a private key and certificate to use for TLS.
     * The key and cert are expected to be PEM encoded and available at "tls.key" and "tls.crt".
     * This is the same format used for the standard "kubernetes.io/tls" Secret type, but no specific type is required.
     * Alternatively, an entry tls.pem, containing the concatenation of cert and key, can be provided.
     * If all of tls.pem, tls.crt and tls.key are present, the tls.pem one needs to be equal to the concatenation of tls.crt and tls.key
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateKeySecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CertificateKeySecret is a reference to a Secret containing a private key and certificate to use for TLS.\nThe key and cert are expected to be PEM encoded and available at \"tls.key\" and \"tls.crt\".\nThis is the same format used for the standard \"kubernetes.io/tls\" Secret type, but no specific type is required.\nAlternatively, an entry tls.pem, containing the concatenation of cert and key, can be provided.\nIf all of tls.pem, tls.crt and tls.key are present, the tls.pem one needs to be equal to the concatenation of tls.crt and tls.key")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CertificateKeySecretRef certificateKeySecretRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CertificateKeySecretRef getCertificateKeySecretRef() {
        return certificateKeySecretRef;
    }

    public void setCertificateKeySecretRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.tls.CertificateKeySecretRef certificateKeySecretRef) {
        this.certificateKeySecretRef = certificateKeySecretRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Optional configures if TLS should be required or optional for connections
     */
    @com.fasterxml.jackson.annotation.JsonProperty("optional")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional configures if TLS should be required or optional for connections")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean optional;

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }
}

