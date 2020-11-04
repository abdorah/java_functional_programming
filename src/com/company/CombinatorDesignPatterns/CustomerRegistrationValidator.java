package com.company.CombinatorDesignPatterns;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.company.CombinatorDesignPatterns.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer,ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.email.endsWith("@um5.ac.ma")
                ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> (customer.phoneNumber.startsWith("06")
                || customer.phoneNumber.startsWith("07"))
                && (customer.phoneNumber.length() == 10)
                ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.dob, LocalDate.now()).getYears()>16
                ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customer->{
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS)
                    ? other.apply(customer) : result;
        };
    }
}