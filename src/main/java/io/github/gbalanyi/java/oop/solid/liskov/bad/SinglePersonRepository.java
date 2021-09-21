package io.github.gbalanyi.java.oop.solid.liskov.bad;

import io.github.gbalanyi.java.oop.basics.Person;

public class SinglePersonRepository extends PersonRepository {

    private Person person;

    @Override
    public void savePerson(Person person) {
        if (this.person == null) {
            this.person = person;
        }
    }
}
