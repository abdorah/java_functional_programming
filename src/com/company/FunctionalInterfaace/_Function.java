package com.company.FunctionalInterfaace;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static int increment(int i){
        return i+1;
    }

    public static int incrementAndMultiply(int i, int j){
        return (i+1)*j;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> incrementFun= i -> ++i;
        Function<Integer, Integer> multiplyBy10Fun= i -> 10*i;
        BiFunction<Integer, Integer, Integer> incrementAndMultiplyFun= (i,j)->(++i)*j;
        System.out.println("!!!!!!!!!!!!!!!!!!!!111111!!!!!!!!!!!!!!!!!!!");
        System.out.println(increment(1));
        System.out.println(incrementAndMultiply(1,10));
        System.out.println("!!!!!!!!!!!!!!!!!!!!222222!!!!!!!!!!!!!!!!!!!");
        Integer x = incrementFun.apply(1);
        System.out.println(x);
        System.out.println(multiplyBy10Fun.apply(x));
        System.out.println(incrementAndMultiply(1,10));
        System.out.println("!!!!!!!!!!!!!!!!!!!!333333!!!!!!!!!!!!!!!!!!!");
        System.out.println(incrementFun.andThen(multiplyBy10Fun).apply(1));
        System.out.println(incrementAndMultiplyFun.apply(1,10));
        System.out.println("!!!!!!!!!!!!!!!!!!!!444444!!!!!!!!!!!!!!!!!!!");
    }
}
