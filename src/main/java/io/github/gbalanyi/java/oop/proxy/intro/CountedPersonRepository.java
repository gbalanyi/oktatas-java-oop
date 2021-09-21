package io.github.gbalanyi.java.oop.proxy.intro;

import io.github.gbalanyi.java.oop.basics.Person;

public class CountedPersonRepository extends PersonRepository {

    private int counter;

    @Override
    public void savePerson(Person person) {
        super.savePerson(person);
        System.out.println(String.format("Person counter: %d", ++counter));
    }
}
