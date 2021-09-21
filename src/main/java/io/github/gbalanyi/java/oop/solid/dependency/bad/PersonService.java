package io.github.gbalanyi.java.oop.solid.dependency.bad;

import io.github.gbalanyi.java.oop.basics.Person;

public class PersonService {

    public void savePerson(Person person) {
        // Save person.

        EmailService emailService = new EmailService(this.getSmtpServer(),
                this.getUser(),
                this.getPassword(),
                this.getOtherConfig());
        emailService.sendActivation(person.getEmail(), person.getFirstName() + " " + person.getLastName());
    }

    private String getSmtpServer() {
        return "smtpServer";
    }

    private String getUser() {
        return "user";
    }

    private String getPassword() {
        return "password";
    }

    private String getOtherConfig() {
        return "otherConfig";
    }
}
