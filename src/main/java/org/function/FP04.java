package org.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FP04 {

    public static void main(String[] args) {

        Consumer<String> C1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        C1.accept("shri");

        HashMap<Integer, String> hh = new HashMap<>();
        hh.put(1, "shree");
        hh.put(2, "nandh");

//        BiConsumer<String, HashMap<Integer, String>> bc1 = FP04::accept;
//        bc1.accept("ssss", hh);

        Predicate<String> p1 = s -> s.length() > 2;
        Predicate<String> p2 = s -> s.isEmpty();

        System.out.println(p1.and(p2).test("swtha"));
        System.out.println(p1.or(p2).test("swtha"));
        System.out.println(p1.or(p2).negate().test("swtha"));


        List<String> stud = Arrays.asList("sww", "shri", "nand", "98");
        stud.forEach(C1);
        stud.stream().sorted().forEach(System.out::println);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
