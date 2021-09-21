package io.github.gbalanyi.java.oop.solid.single.good;

import java.time.LocalDate;

import io.github.gbalanyi.java.oop.basics.Person;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        EmailService emailService = new EmailService();
        emailService.sendEmail("john.doe@company.com", "Message");

        PrintService printService = new PrintService();
        printService.printDocument("Printable document");

        Person person = new Person();
        person.setGender("FEMALE");
        person.setDateOfBirth(LocalDate.of(2010, 6, 12));
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setAddress("1094, Budapest Szél u. 12.");
        person.setEmail("jane.smith@gmail.com");
        PersonService personService = new PersonService();
        personService.savePerson(person);
    }

}
