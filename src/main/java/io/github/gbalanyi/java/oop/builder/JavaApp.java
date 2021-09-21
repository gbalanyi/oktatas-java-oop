package io.github.gbalanyi.java.oop.builder;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setGender("FEMALE");
        person1.setDateOfBirth(LocalDate.of(2010, 6, 12));
        person1.setFirstName("Jane");
        person1.setLastName("Smith");
        person1.setAddress("1094, Budapest Szél u. 12.");
        personList.add(person1);

        personList.add(new Person.PersonBuilder()
                .gender("MALE")
                .dateOfBirth(LocalDate.of(1972, 10, 05))
                .firstName("John")
                .lastName("Doe")
                .address("7624, Pécs Felső u. 5.")
                .build());

        getFilteredPersonNames(personList, 18).stream()
                .forEach(System.out::println);
    }

    private List<String> getFilteredPersonNames(List<Person> personList, int age) {
        return personList.stream()
                .filter(person -> Period.between(person.getDateOfBirth(), LocalDate.now().plusDays(1)).getYears() >= age)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }
}
