package org.function;

import java.util.Optional;

public class FP05 {

    public static Optional<String> ofnull() {
        Optional<String> ss = Optional.ofNullable("hllo");
        return ss;
    }

    public static Optional<String> of() {

        Optional<String> ss = Optional.of("hllo");
        return ss;
    }

    public static Optional<String> empty() {
        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println(ofnull());
        System.out.println(of().get());
        System.out.println(of().isPresent());
        System.out.println(empty());
        System.out.println(10 + "20");
        Optional<Integer> s = Optional.of(123);
        s.ifPresent(ss -> ss.toString());


    }
}
