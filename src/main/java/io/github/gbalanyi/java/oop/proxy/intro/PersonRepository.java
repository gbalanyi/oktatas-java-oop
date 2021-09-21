package io.github.gbalanyi.java.oop.proxy.intro;

import java.util.HashSet;
import java.util.Set;

import io.github.gbalanyi.java.oop.basics.Person;

public class PersonRepository {

    private Set<Person> persons = new HashSet<>();

    public void savePerson(Person person) {
        persons.add(person);
    }
}
