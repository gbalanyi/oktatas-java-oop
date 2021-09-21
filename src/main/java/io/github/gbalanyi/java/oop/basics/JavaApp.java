package io.github.gbalanyi.java.oop.basics;

import java.time.LocalDate;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp(){

        Person person = new Person();
        person.setGender("FEMALE");
        person.setDateOfBirth(LocalDate.of(1980, 6,12));
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setAddress("1094, Budapest Szél u. 12.");
        person.setEmail("jane.smith@gmail.com");

        User user = new User();
        user.setGender("MALE");
        user.setDateOfBirth(LocalDate.of(1972, 10,05));
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setAddress("7624, Pécs Felső u. 5.");
        user.setEmail("john.doeh@gmail.com");
        user.setUserName("John");
        user.setPassword("John'sPassword");

        PersonService personService = new PersonService();
        personService.createPerson(person);
        personService.createPerson(user);
    }
}
