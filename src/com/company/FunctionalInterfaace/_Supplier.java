package com.company.FunctionalInterfaace;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static Supplier<List<String>> people = () -> List.of(
            "Mohamed",
            "Abderrahmane",
            "Ajar",
            "Omar",
            "Youssef"
    );

    public static void main(String[] args) {
        System.out.println(people.get());
    }
}
