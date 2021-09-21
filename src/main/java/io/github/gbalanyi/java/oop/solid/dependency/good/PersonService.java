package io.github.gbalanyi.java.oop.solid.dependency.good;

import io.github.gbalanyi.java.oop.basics.Person;

public class PersonService {

    public void savePerson(Person person) {
        // Save person.

        new NotificationServiceFactory().createNotificationService()
                .sendActivation(person.getEmail(), person.getFirstName() + " " + person.getLastName());
    }
}
