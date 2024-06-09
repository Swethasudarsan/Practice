package org.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FP02 {

    public static void main(String[] args) {
        sqsum(Arrays.asList(9, 10, 1, 2, 3, 4));
    }

    public static void sqsum(List<Integer> numbers) {
        Function<Integer, Integer> integerFunction = num -> num * num * num;

        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
        numbers.stream().filter(num -> num % 2 == 1).map(unaryOperator).forEach(System.out::println);

        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply(3, 3));

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x * y;
    }


}













