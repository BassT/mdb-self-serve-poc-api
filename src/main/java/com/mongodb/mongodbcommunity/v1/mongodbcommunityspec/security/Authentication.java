package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"agentCertificateSecretRef","agentMode","ignoreUnknownUsers","modes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AgentCertificateSecret is a reference to a Secret containing the certificate and the key for the automation agent
     * The secret needs to have available:
     * - certificate under key: "tls.crt"
     * - private key under key: "tls.key"
     * If additionally, tls.pem is present, then it needs to be equal to the concatenation of tls.crt and tls.key
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentCertificateSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AgentCertificateSecret is a reference to a Secret containing the certificate and the key for the automation agent\nThe secret needs to have available:\n- certificate under key: \"tls.crt\"\n- private key under key: \"tls.key\"\nIf additionally, tls.pem is present, then it needs to be equal to the concatenation of tls.crt and tls.key")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.authentication.AgentCertificateSecretRef agentCertificateSecretRef;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.authentication.AgentCertificateSecretRef getAgentCertificateSecretRef() {
        return agentCertificateSecretRef;
    }

    public void setAgentCertificateSecretRef(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.security.authentication.AgentCertificateSecretRef agentCertificateSecretRef) {
        this.agentCertificateSecretRef = agentCertificateSecretRef;
    }

    public enum AgentMode {

        @com.fasterxml.jackson.annotation.JsonProperty("SCRAM")
        SCRAM("SCRAM"), @com.fasterxml.jackson.annotation.JsonProperty("SCRAM-SHA-256")
        SCRAMSHA256("SCRAM-SHA-256"), @com.fasterxml.jackson.annotation.JsonProperty("SCRAM-SHA-1")
        SCRAMSHA1("SCRAM-SHA-1"), @com.fasterxml.jackson.annotation.JsonProperty("X509")
        X509("X509");

        java.lang.String value;

        AgentMode(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * AgentMode contains the authentication mode used by the automation agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AgentMode contains the authentication mode used by the automation agent.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AgentMode agentMode;

    public AgentMode getAgentMode() {
        return agentMode;
    }

    public void setAgentMode(AgentMode agentMode) {
        this.agentMode = agentMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ignoreUnknownUsers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    // @io.fabric8.generator.annotation.Nullable()
    private Boolean ignoreUnknownUsers = true;

    public Boolean getIgnoreUnknownUsers() {
        return ignoreUnknownUsers;
    }

    public void setIgnoreUnknownUsers(Boolean ignoreUnknownUsers) {
        this.ignoreUnknownUsers = ignoreUnknownUsers;
    }

    public enum Modes {

        @com.fasterxml.jackson.annotation.JsonProperty("SCRAM")
        SCRAM("SCRAM"), @com.fasterxml.jackson.annotation.JsonProperty("SCRAM-SHA-256")
        SCRAMSHA256("SCRAM-SHA-256"), @com.fasterxml.jackson.annotation.JsonProperty("SCRAM-SHA-1")
        SCRAMSHA1("SCRAM-SHA-1"), @com.fasterxml.jackson.annotation.JsonProperty("X509")
        X509("X509");

        java.lang.String value;

        Modes(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Modes is an array specifying which authentication methods should be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modes")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Modes is an array specifying which authentication methods should be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Modes> modes;

    public java.util.List<Modes> getModes() {
        return modes;
    }

    public void setModes(java.util.List<Modes> modes) {
        this.modes = modes;
    }
}

