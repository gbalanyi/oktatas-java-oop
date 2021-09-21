package io.github.gbalanyi.java.oop.proxy.staticp;

import io.github.gbalanyi.java.oop.basics.Person;

public class LoggedPersonRepositoryProxy implements PersonRepository {

    private PersonRepository personRepository;

    public LoggedPersonRepositoryProxy(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void savePerson(Person person) {
        personRepository.savePerson(person);
        System.out.println(String.format("Person saved: %s %s", person.getFirstName(), person.getLastName()));
    }
}
