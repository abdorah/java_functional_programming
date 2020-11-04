package com.company.DeclarativeApprochIntro;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.company.DeclarativeApprochIntro.Gender.*;

public class Main {

    public static List<Person> people= List.of(
            new Person(MALE,"Mohamed"),
            new Person(MALE,"Abderrahmane"),
            new Person(FEMALE,"Ajar"),
            new Person(MALE,"Omar"),
            new Person(MALE,"Youssef")
    );

    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!111111!!!!!!!!!!!!!!!!!!!");
        System.out.println(people.stream()
                                    .filter(person ->
                                            FEMALE.equals(person.getGender()))
                                        .findFirst()
                                        .toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!222222!!!!!!!!!!!!!!!!!!!");
        people.stream()
                .filter(person ->
                        MALE.equals(person.getGender()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!!!333333!!!!!!!!!!!!!!!!!!!");
        people.stream()
                .filter(person ->
                        MALE.equals(person.getGender()))
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!!!444444!!!!!!!!!!!!!!!!!!!");
        Predicate<Person> personPredicate = person -> MALE.equals(person.getGender());
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
        System.out.println("!!!!!!!!!!!!!!!!!!!!555555!!!!!!!!!!!!!!!!!!!");
    }
}
