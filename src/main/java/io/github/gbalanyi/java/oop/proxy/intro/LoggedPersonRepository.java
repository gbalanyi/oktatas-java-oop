package io.github.gbalanyi.java.oop.proxy.intro;

import io.github.gbalanyi.java.oop.basics.Person;

public class LoggedPersonRepository extends PersonRepository {

    @Override
    public void savePerson(Person person) {
        super.savePerson(person);
        System.out.println(String.format("Person saved: %s %s", person.getFirstName(), person.getLastName()));
    }
}
