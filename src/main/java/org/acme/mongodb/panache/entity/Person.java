package org.acme.mongodb.panache.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "persons")
public class Person extends PanacheMongoEntity {
  public String name;
  public String lastName;
}
