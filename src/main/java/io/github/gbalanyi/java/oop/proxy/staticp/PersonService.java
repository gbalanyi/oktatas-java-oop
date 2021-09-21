package io.github.gbalanyi.java.oop.proxy.staticp;

import io.github.gbalanyi.java.oop.basics.Person;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void createPerson(Person person) {
        personRepository.savePerson(person);
        System.out.println("Person created by PersonService.");
        System.out.println("");
    }
}
