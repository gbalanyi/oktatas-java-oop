package io.github.gbalanyi.java.oop.builder;

import java.time.LocalDate;

public class Person {
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String address;

    public Person() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class PersonBuilder {

        private String gender;
        private LocalDate dateOfBirth;
        private String firstName;
        private String lastName;
        private String address;

        public PersonBuilder() {
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setGender(gender);
            person.setDateOfBirth(dateOfBirth);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddress(address);

            return person;
        }
    }
}
