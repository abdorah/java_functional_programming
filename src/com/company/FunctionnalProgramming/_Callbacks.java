package com.company.FunctionnalProgramming;

import java.util.function.Consumer;

public class _Callbacks {

    public static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName == null){
            callback.accept("the last name wasn't provided for "+firstName+"!");
        } else {
            System.out.println(lastName);
        }
    }

    public static void runnableHello(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName == null){
            callback.run();
        } else {
            System.out.println(lastName);
        }
    }

    public static void main(String[] args) {
        hello("Mohamed",null, System.out::println);
        runnableHello("Mohamed",null, ()->
                System.out.println("the last name wasn't provided!"));
    }
}
