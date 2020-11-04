package com.company.CombinatorDesignPatterns;

import java.time.LocalDate;
import java.util.Optional;

import static com.company.CombinatorDesignPatterns.CustomerRegistrationValidator.*;
import static com.company.CombinatorDesignPatterns.ValidationResult.*;

public class CustomerValidatorService {

    public static void main(String[] args) {

        Customer customer =new Customer("Mohamed"
                ,"010253419"
                ,"kotbi_mohamed@um5.ac.ma"
                ,LocalDate.of(1996,2,22)) ;

        //Using Combinator Design pattern

        ValidationResult validationResult = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        //Normal way
//        System.out.println(validationResult);
//        if(validationResult != SUCCESS){
//            throw new InvalidCustomerDetailsException(
//                    "the customer details are not valid and the cause is:\n"
//                    +validationResult);
//        }

        //Using lambdas
        System.out.println(
                Optional
                        .ofNullable(validationResult==SUCCESS?SUCCESS:null)
                        .orElseThrow(()-> new InvalidCustomerDetailsException(
                                "the customer details are not valid and the cause is:\n"
                                        +validationResult)));
    }
}
