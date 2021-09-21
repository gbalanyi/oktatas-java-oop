package io.github.gbalanyi.java.oop.proxy.staticp;

import java.time.LocalDate;

import io.github.gbalanyi.java.oop.basics.Person;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Person person = new Person();
        person.setGender("FEMALE");
        person.setDateOfBirth(LocalDate.of(1980, 6, 12));
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setAddress("1094, Budapest Szél u. 12.");
        person.setEmail("jane.smith@gmail.com");

        // Egyszerű person létrehozás.
        PersonService personService1 = new PersonService(new DefaultPersonRepository());
        personService1.createPerson(person);

        // Naplózott person létrehozás.
        PersonService personService2 = new PersonService(new LoggedPersonRepositoryProxy(new DefaultPersonRepository()));
        personService2.createPerson(person);

        // Számlált person létrehozás.
        PersonService personService3 = new PersonService(new CountedPersonRepositoryProxy(new DefaultPersonRepository()));
        personService3.createPerson(person);

        // Naplózott és számlált person létrehozás.
        PersonService personService4 = new PersonService(new LoggedPersonRepositoryProxy(
                new CountedPersonRepositoryProxy(new DefaultPersonRepository())));
        personService4.createPerson(person);

        // Számlált és naplózott person létrehozás.
        PersonService personService5 = new PersonService(new CountedPersonRepositoryProxy(
                new LoggedPersonRepositoryProxy(new DefaultPersonRepository())));
        personService5.createPerson(person);
    }
}
