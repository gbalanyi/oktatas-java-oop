package io.github.gbalanyi.java.oop.solid.liskov.good;

import java.time.LocalDate;

import io.github.gbalanyi.java.oop.basics.Person;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Person person1 = new Person();
        person1.setGender("FEMALE");
        person1.setDateOfBirth(LocalDate.of(1980, 6, 12));
        person1.setFirstName("Jane");
        person1.setLastName("Smith");
        person1.setAddress("1094, Budapest Szél u. 12.");
        person1.setEmail("jane.smith@gmail.com");

        Person person2 = new Person();
        person2.setGender("MALE");
        person2.setDateOfBirth(LocalDate.of(1972, 10, 05));
        person2.setFirstName("John");
        person2.setLastName("Doe");
        person2.setAddress("7624, Pécs Felső u. 5.");
        person2.setEmail("john.doe@gmail.com");

        PersonRepository personRepository = new PersonRepository();
        this.savePerson(personRepository, person1);
        this.savePerson(personRepository, person2);
        this.listPersons(personRepository);

        PersonRepository singlePersonRepository = new SinglePersonRepository();
        this.savePerson(singlePersonRepository, person1);
        this.savePerson(singlePersonRepository, person2);
        this.listPersons(singlePersonRepository);
    }

    private void savePerson(PersonRepository personRepository, Person person) {
        personRepository.savePerson(person);
    }

    private void listPersons(PersonRepository personRepository) {
        for (Person person : personRepository.getPersons()) {
            System.out.println(String.format("Repository: %s, Person: %s %s", personRepository.getClass().getSimpleName(),
                    person.getFirstName(),
                    person.getLastName()));
        }
    }
}
