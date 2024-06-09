package org.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange","Pineapple");
        String result = fruits.stream().filter(fruit -> fruit.length()%3 ==0|| fruit.length()%4==0).collect(Collectors.joining("-"));
        System.out.println(result);

        String s = "ABDBAXC";
        StringBuilder res = s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
        System.out.println(res.toString());
        s.chars().distinct().sorted().forEach(val -> System.out.println(val));
    }



}
