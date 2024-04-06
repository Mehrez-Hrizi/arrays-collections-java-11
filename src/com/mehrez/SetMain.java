package com.mehrez;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String ...args) {

        Set<Integer> primeNumbs1 = new HashSet<>();
        Set<Integer> primeNumbs2 = new TreeSet<>(Comparator.reverseOrder());

        primeNumbs1.add(71);primeNumbs1.add(61);primeNumbs1.add(41);primeNumbs1.add(1);
        primeNumbs2.add(71);primeNumbs2.add(61);primeNumbs2.add(41);primeNumbs2.add(1);
        primeNumbs1.forEach(System.out::println);
        System.out.println("---------");
        primeNumbs2.forEach(System.out::println);

        System.out.println(primeNumbs1.add(5));  //true
        System.out.println(primeNumbs1.add(5));  //false
    }
}
