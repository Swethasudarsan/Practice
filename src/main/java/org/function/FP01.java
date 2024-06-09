package org.function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01 {
      public static void main (String[] args){
          disSort(Arrays.asList("spring","springboot","java"));
      }
      public static int sum(int a,int b){return a+b;}

    public static void nosprint(List<Integer> numb){
          numb.stream().filter(num -> num%2==1).map(num ->num*num*num).forEach(System.out::println);
          numb.stream().reduce(0,FP01::sum);
    }

    public static void nolist(List<String> courses){
          courses.stream().filter(course ->course.contains("spring")).forEach(System.out::println);
        courses.stream().filter(course ->course.length()>=4).forEach(System.out::println);
        courses.stream().map(course ->course.length()).forEach(System.out::println);
    }

    public static void sqsum(List<Integer> numbers){
          System.out.println(numbers.stream().map(no ->no*no).reduce(0,FP01::sum));
        System.out.println(numbers.stream().map(no ->no*no*no).reduce(0,FP01::sum));
        System.out.println(numbers.stream().filter(no ->no%2==1).reduce(0,FP01::sum));
        System.out.println(numbers.stream().map(no ->no*no).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(no ->no%2==0).collect(Collectors.toList()));
    }

    public static void disSort(List<String> course){
          course.stream().distinct().forEach(System.out::println);
          course.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
          course.stream().map(String::length).toList().forEach(System.out::println);
    }
}
