package io.github.gbalanyi.java.oop.proxy.staticp;

import java.util.HashSet;
import java.util.Set;

import io.github.gbalanyi.java.oop.basics.Person;

public class DefaultPersonRepository implements PersonRepository {

    private Set<Person> persons = new HashSet<>();

    @Override
    public void savePerson(Person person) {
        persons.add(person);
    }
}
