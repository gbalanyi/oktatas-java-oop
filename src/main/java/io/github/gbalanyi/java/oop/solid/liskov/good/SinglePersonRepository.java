package io.github.gbalanyi.java.oop.solid.liskov.good;

import io.github.gbalanyi.java.oop.basics.Person;

public class SinglePersonRepository extends PersonRepository {

    @Override
    public void savePerson(Person person) {
        if (this.getPersons().isEmpty()) {
            super.savePerson(person);
        }
    }
}
