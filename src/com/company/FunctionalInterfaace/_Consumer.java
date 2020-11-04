package com.company.FunctionalInterfaace;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void greetCustomer(Customer customer){
        System.out.println("Hello "
                +customer.customerName
                +", thank you for registering your phone number "
                +customer.customerPhoneNumber+".");
    }

    public static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "
            +customer.customerName
            +", thank you for registering your phone number "
            +customer.customerPhoneNumber+".");

    public static BiConsumer<Customer,Boolean> greetCustomerConsumerBi = ((customer, show)
            -> {
        if (show) {
            System.out.println("Hello "
                    + customer.customerName
                    + ", thank you for registering your phone number "
                    + customer.customerPhoneNumber
                    + ".");
        } else {
            System.out.println("Hello "
                    + customer.customerName
                    + ", thank you for registering your phone number "
                    + "**********"
                    + ".");
        }
    });

    public static BiConsumer<Customer,Boolean> greetCustomerConsumerBiPredicate = ((customer, show)
            -> {
            System.out.println("Hello "
                    + customer.customerName
                    + ", thank you for registering your phone number "
                    +(show ? customer.customerPhoneNumber : "**********")
                    + ".");
    });

    public static void main(String[] args) {

        Customer customer=new Customer("Mohamed","0625341987");
        System.out.println("!!!!!!!!!!!!!!!!!!!!111111!!!!!!!!!!!!!!!!!!!");
        greetCustomer(customer);
        System.out.println("!!!!!!!!!!!!!!!!!!!!222222!!!!!!!!!!!!!!!!!!!");
        greetCustomerConsumer.accept(customer);
        System.out.println("!!!!!!!!!!!!!!!!!!!!333333!!!!!!!!!!!!!!!!!!!");
        greetCustomerConsumerBi.accept(customer,true);
        greetCustomerConsumerBi.accept(customer,false);
        System.out.println("!!!!!!!!!!!!!!!!!!!!444444!!!!!!!!!!!!!!!!!!!");
        greetCustomerConsumerBiPredicate.accept(customer,true);
        greetCustomerConsumerBiPredicate.accept(customer,false);
        System.out.println("!!!!!!!!!!!!!!!!!!!!555555!!!!!!!!!!!!!!!!!!!");
    }
}
