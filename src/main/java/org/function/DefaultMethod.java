package org.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethod {
    public static void main(String[] args) {
        List<String> stud = Arrays.asList("sww", "shri", "nand");
        Collections.sort(stud);
        System.out.println(stud);

        Comparator<String> cc = Comparator.naturalOrder();
        stud.sort(cc);
        System.out.println(stud);

    }
}
