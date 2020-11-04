package com.company.FunctionalInterfaace;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static boolean isPhoneNumberValid(String phoneNumber){
        return ((phoneNumber.startsWith("06")
                || phoneNumber.startsWith("07"))
                && (phoneNumber.length() == 10)) ;
    }

    public static Predicate<String> isPhoneNumberValidPred = phoneNumber
            -> ((phoneNumber.startsWith("06")
            || phoneNumber.startsWith("07"))
            && (phoneNumber.length() == 10)) ;

    public static Predicate<String> isPhoneNumberContains3Pred = phoneNumber
            -> (phoneNumber.contains("3")) ;

    public static BiPredicate<String,Integer> isPhoneNumberValidBiPred  = ((phoneNumber,length)
            -> ((phoneNumber.startsWith("06")
            || phoneNumber.startsWith("07"))
            && (phoneNumber.length() == length))) ;

    public static void main(String[] args) {

        System.out.println("!!!!!!!!!!!!!!!!!!!!111111!!!!!!!!!!!!!!!!!!!");
        System.out.println(isPhoneNumberValid("0612314567"));
        System.out.println(isPhoneNumberValid("0712314567"));
        System.out.println(isPhoneNumberValid("061231456"));
        System.out.println(isPhoneNumberValid("071231457"));
        System.out.println(isPhoneNumberValid("0112314567"));
        System.out.println("!!!!!!!!!!!!!!!!!!!!222222!!!!!!!!!!!!!!!!!!!");
        System.out.println(isPhoneNumberValidPred.test("0612314567"));
        System.out.println(isPhoneNumberValidPred.test("0712314567"));
        System.out.println(isPhoneNumberValidPred.test("061231456"));
        System.out.println(isPhoneNumberValidPred.test("061231457"));
        System.out.println(isPhoneNumberValidPred.test("0112314567"));
        System.out.println("!!!!!!!!!!!!!!!!!!!!333333!!!!!!!!!!!!!!!!!!!");
        System.out.println(isPhoneNumberValidPred.and(isPhoneNumberContains3Pred).test("0612314567"));
        System.out.println(isPhoneNumberValidPred.and(isPhoneNumberContains3Pred).test("0612014567"));
        System.out.println(isPhoneNumberValidPred.or(isPhoneNumberContains3Pred).test("0612014567"));
        System.out.println("!!!!!!!!!!!!!!!!!!!!444444!!!!!!!!!!!!!!!!!!!");
        System.out.println(isPhoneNumberValidBiPred.test("0612314567",10));
        System.out.println(isPhoneNumberValidBiPred.test("0612314567",9));
        System.out.println("!!!!!!!!!!!!!!!!!!!!555555!!!!!!!!!!!!!!!!!!!");
    }
}
