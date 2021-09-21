package io.github.gbalanyi.java.oop.basics;

public class PersonService {

    public void createPerson(Person person){
        // validate, create, etc.
        System.out.println(String.format("Person created: %s", person.getFirstName() + " " + person.getLastName()));
    }
}
