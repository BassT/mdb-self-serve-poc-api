package com.mongodb.mongodbcommunity.v1.mongodbcommunityspec.automationconfig.processes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"includeAuditLogsWithMongoDBLogs","numTotal","numUncompressed","percentOfDiskspace","sizeThresholdMB","timeThresholdHrs"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LogRotate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * set to 'true' to have the Automation Agent rotate the audit files along
     * with mongodb log files
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeAuditLogsWithMongoDBLogs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("set to 'true' to have the Automation Agent rotate the audit files along\nwith mongodb log files")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean includeAuditLogsWithMongoDBLogs;

    public Boolean getIncludeAuditLogsWithMongoDBLogs() {
        return includeAuditLogsWithMongoDBLogs;
    }

    public void setIncludeAuditLogsWithMongoDBLogs(Boolean includeAuditLogsWithMongoDBLogs) {
        this.includeAuditLogsWithMongoDBLogs = includeAuditLogsWithMongoDBLogs;
    }

    /**
     * maximum number of log files to have total
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numTotal")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("maximum number of log files to have total")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long numTotal;

    public Long getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(Long numTotal) {
        this.numTotal = numTotal;
    }

    /**
     * maximum number of log files to leave uncompressed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numUncompressed")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("maximum number of log files to leave uncompressed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long numUncompressed;

    public Long getNumUncompressed() {
        return numUncompressed;
    }

    public void setNumUncompressed(Long numUncompressed) {
        this.numUncompressed = numUncompressed;
    }

    /**
     * Maximum percentage of the total disk space these log files should take up.
     * The string needs to be able to be converted to float64
     */
    @com.fasterxml.jackson.annotation.JsonProperty("percentOfDiskspace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum percentage of the total disk space these log files should take up.\nThe string needs to be able to be converted to float64")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String percentOfDiskspace;

    public String getPercentOfDiskspace() {
        return percentOfDiskspace;
    }

    public void setPercentOfDiskspace(String percentOfDiskspace) {
        this.percentOfDiskspace = percentOfDiskspace;
    }

    /**
     * Maximum size for an individual log file before rotation.
     * The string needs to be able to be converted to float64.
     * Fractional values of MB are supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeThresholdMB")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum size for an individual log file before rotation.\nThe string needs to be able to be converted to float64.\nFractional values of MB are supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sizeThresholdMB;

    public String getSizeThresholdMB() {
        return sizeThresholdMB;
    }

    public void setSizeThresholdMB(String sizeThresholdMB) {
        this.sizeThresholdMB = sizeThresholdMB;
    }

    /**
     * maximum hours for an individual log file before rotation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeThresholdHrs")
    // @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("maximum hours for an individual log file before rotation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long timeThresholdHrs;

    public Long getTimeThresholdHrs() {
        return timeThresholdHrs;
    }

    public void setTimeThresholdHrs(Long timeThresholdHrs) {
        this.timeThresholdHrs = timeThresholdHrs;
    }
}

