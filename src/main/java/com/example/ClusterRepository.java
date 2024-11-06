package com.example;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClusterRepository {
    private final MongoCollection<ClusterEntity> coll;

    public ClusterRepository(MongoClient mongoClient) {
        this.coll = mongoClient.getDatabase("test").getCollection("clusters", ClusterEntity.class);
    }

    public String add(ClusterEntity cluster) {
        return coll.insertOne(cluster).getInsertedId().asObjectId().getValue().toHexString();
    }

    public List<ClusterEntity> get() {
        return coll.find().into(new ArrayList<ClusterEntity>());
    }
}
