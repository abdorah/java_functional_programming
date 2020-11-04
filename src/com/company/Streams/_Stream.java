package com.company.Streams;

import com.company.DeclarativeApprochIntro.Person;

import java.util.List;
import java.util.stream.Collectors;

import static com.company.DeclarativeApprochIntro.Gender.FEMALE;
import static com.company.DeclarativeApprochIntro.Gender.MALE;

public class _Stream {

    public static List<Person> people= List.of(
            new Person(MALE,"Mohamed"),
            new Person(MALE,"Abderrahmane"),
            new Person(FEMALE,"Ajar"),
            new Person(MALE,"Omar"),
            new Person(MALE,"Youssef")
    );

    public static void main(String[] args) {

        System.out.println("!!!!!!!!!!!!!!!!!!!!111111!!!!!!!!!!!!!!!!!!!");
        people
                .stream()
                .map(Person::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!!!222222!!!!!!!!!!!!!!!!!!!");
        people
                .stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!!!333333!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!444444!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!555555!!!!!!!!!!!!!!!!!!!");
    }
}
