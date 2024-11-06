package com.example;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class ClusterEntity {
    @JsonSerialize(using = ToStringSerializer.class)
    public ObjectId id;
    public String name;
    public ClusterStatus status;

    public ClusterEntity() {}

    public ClusterEntity(ObjectId id, String name, ClusterStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
