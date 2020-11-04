package com.company.OptionalImplementation;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
//        System.out.println(Optional.ofNullable(null).orElseGet(() -> "value to show by default"));
//        System.out.println(Optional.ofNullable(null).orElseThrow(IllegalStateException::new));
//        System.out.println(Optional.ofNullable(null)
//               .orElseThrow(()-> new IllegalStateException("the default value is missed")));
        Optional.ofNullable(null).ifPresentOrElse(email->
            System.out.println("Sending email to "+email+"."),
            () -> System.out.println("Cannot send emails!")
        );

//        String s=null;
//        if(s==null){
//            System.out.println(s.length());
//        } else {
//            System.out.println(s);
//        }

    }
}
