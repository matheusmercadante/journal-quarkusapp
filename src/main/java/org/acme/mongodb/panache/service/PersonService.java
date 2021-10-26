package org.acme.mongodb.panache.service;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.acme.mongodb.panache.entity.Person;
import org.acme.mongodb.panache.exception.PersonNotFoundException;
import org.acme.mongodb.panache.repository.PersonRepository;
import org.bson.types.ObjectId;

@ApplicationScoped
public class PersonService {
  @Inject
  PersonRepository personRepository;

  public List<Person> listAll() {
    List<Person> persons = personRepository.listAll();

    return persons;
  }

  public Person listOne(String id) throws PersonNotFoundException {
    return personRepository.findById(new ObjectId(id));
  }

  public void create(Person person) {
    personRepository.persist(person);
  }

  public void update(String id, Person person) throws PersonNotFoundException {
    Person personToUpdate = findById(id);

    person.id = personToUpdate.id;

    personRepository.update(personToUpdate, person);
  }

  public void delete(String id) throws PersonNotFoundException {
    Person person = personRepository.findByIdOptional(new ObjectId(id))
        .orElseThrow(() -> new PersonNotFoundException(id));

    personRepository.deleteById(person.id);
  }

  private Person findById(String id) throws PersonNotFoundException {
    return personRepository.findByIdOptional(new ObjectId(id))
    .orElseThrow(() -> new PersonNotFoundException(id));
  }
}
