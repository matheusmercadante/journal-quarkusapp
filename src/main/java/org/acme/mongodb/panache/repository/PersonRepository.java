package org.acme.mongodb.panache.repository;

import javax.enterprise.context.ApplicationScoped;
import org.acme.mongodb.panache.entity.Person;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {
}
