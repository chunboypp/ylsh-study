package com.ylsh.java8.sty001;

import java.util.function.Predicate;

public class Sty006 {

    public static void main(String[] args){
        Predicate<String> p = str -> str.length() > 5;

        System.out.println(p.test("fsad"));
        System.out.println();

    }
}
