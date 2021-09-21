package io.github.gbalanyi.java.oop.proxy.staticp;

import io.github.gbalanyi.java.oop.basics.Person;

public class CountedPersonRepositoryProxy implements PersonRepository {

    private PersonRepository personRepository;

    private int counter;

    public CountedPersonRepositoryProxy(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void savePerson(Person person) {
        personRepository.savePerson(person);
        System.out.println(String.format("Person counter: %d", ++counter));
    }
}
