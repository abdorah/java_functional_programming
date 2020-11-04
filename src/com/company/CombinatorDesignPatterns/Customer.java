package com.company.CombinatorDesignPatterns;

import java.time.LocalDate;

public class  Customer {

    public String name;
    public String phoneNumber;
    public String email;
    public LocalDate dob;

    public Customer(String name, String phoneNumber, String email, LocalDate dob) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;
    }
}
