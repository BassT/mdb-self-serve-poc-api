package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auditLogRotate","logFile","logLevel","logRotate","maxLogFileDurationHours","systemLog"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Agent implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AuditLogRotate if enabled, will enable AuditLogRotate for all processes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditLogRotate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuditLogRotate if enabled, will enable AuditLogRotate for all processes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.AuditLogRotate auditLogRotate;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.AuditLogRotate getAuditLogRotate() {
        return auditLogRotate;
    }

    public void setAuditLogRotate(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.AuditLogRotate auditLogRotate) {
        this.auditLogRotate = auditLogRotate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logFile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logFile;

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * LogRotate if enabled, will enable LogRotate for all processes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logRotate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogRotate if enabled, will enable LogRotate for all processes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.LogRotate logRotate;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.LogRotate getLogRotate() {
        return logRotate;
    }

    public void setLogRotate(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.LogRotate logRotate) {
        this.logRotate = logRotate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxLogFileDurationHours")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxLogFileDurationHours;

    public Long getMaxLogFileDurationHours() {
        return maxLogFileDurationHours;
    }

    public void setMaxLogFileDurationHours(Long maxLogFileDurationHours) {
        this.maxLogFileDurationHours = maxLogFileDurationHours;
    }

    /**
     * SystemLog configures system log of mongod
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemLog")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SystemLog configures system log of mongod")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.SystemLog systemLog;

    public com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.SystemLog getSystemLog() {
        return systemLog;
    }

    public void setSystemLog(com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.agent.SystemLog systemLog) {
        this.systemLog = systemLog;
    }
}

