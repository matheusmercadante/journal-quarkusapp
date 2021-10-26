package org.acme.mongodb.panache.exception;

public class PersonNotFoundException extends Exception {
  public PersonNotFoundException(String id) {
    super("Person not found with this: " + id);
  }
}
