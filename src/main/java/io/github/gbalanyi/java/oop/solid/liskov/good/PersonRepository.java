package io.github.gbalanyi.java.oop.solid.liskov.good;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import io.github.gbalanyi.java.oop.basics.Person;

public class PersonRepository {

    private Set<Person> personSet = new HashSet<>();

    public void savePerson(Person person) {
        personSet.add(person);
    }

    public Set<Person> getPersons() {
        return Collections.unmodifiableSet(personSet);
    }
}
