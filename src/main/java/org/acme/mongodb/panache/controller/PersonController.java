package org.acme.mongodb.panache.controller;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.mongodb.panache.entity.Person;
import org.acme.mongodb.panache.exception.PersonNotFoundException;
import org.acme.mongodb.panache.service.PersonService;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

  @Inject
  PersonService personService;

  @GET
  public List<Person> getAll() {
    return personService.listAll();
  }

  @GET
  @Path("/{id}")
  public Person getOne(@PathParam("id") String id) throws PersonNotFoundException {
    return personService.listOne(id);
  }

  @POST
  public void create(Person person) {
    personService.create(person);
  }

  @PATCH
  @Path("/{id}")
  public void update(@PathParam("id") String id, Person person) throws PersonNotFoundException {
    personService.update(id, person);
  }

  @DELETE
  @Path("/{id}")
  public void delete(@PathParam("id") String id) throws PersonNotFoundException {
    personService.delete(id);
  }
}
