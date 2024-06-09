package org.function;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Course {
    public Course(String name, String genre, int rating, int studs) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.studs = studs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStuds() {
        return studs;
    }

    public void setStuds(int studs) {
        this.studs = studs;
    }

    private String name;
    private String genre;
    private int rating;
    private int studs;
}

public class FP03 {

    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(new Course("Spring", "FW", 92, 2000),
                new Course("SpringBoot", "FW", 97, 1800),
                new Course("AWS", "Cloud", 94, 1900),
                new Course("Azure", "Cloud", 93, 2100),
                new Course("Java", "FW", 51, 2200));

        courses.stream().filter(cour -> cour.getRating() > 80).forEach(System.out::println);

        //allmatch
        System.out.println(courses.stream().allMatch(course -> course.getRating() > 50));

        //nonematch
        System.out.println(courses.stream().noneMatch(course -> course.getRating() < 50));

        //anymatch
        System.out.println(courses.stream().anyMatch(course -> course.getRating() > 50));

        //sort
        Comparator<Course> cc = Comparator.comparing(Course::getRating);
        System.out.println(courses.stream().sorted(cc).collect(Collectors.toList()));
        Comparator<Course> ccc = Comparator.comparing(Course::getRating).reversed();
        System.out.println(courses.stream().sorted(ccc).collect(Collectors.toList()));

        //thenComparing
        Comparator<Course> cccc = Comparator.comparing(Course::getRating).thenComparing(Course::getStuds);
        System.out.println(courses.stream().sorted(cccc).collect(Collectors.toList()));

        //limit
        System.out.println(courses.stream().limit(2).collect(Collectors.toList()));

        //skip
        System.out.println(courses.stream().skip(2).collect(Collectors.toList()));

        //max & min
        System.out.println(courses.stream().max(cccc));
        System.out.println(courses.stream().min(cccc));

        //orElse can be used if there are no courses matching the criteria to return a default course back
        //findFirst
        System.out.println(courses.stream().findFirst());

        //sum, average, count
        System.out.println(courses.stream().mapToInt(cour -> cour.getRating()).sum());
        System.out.println(courses.stream().mapToInt(cour -> cour.getRating()).average());
        System.out.println(courses.stream().mapToInt(cour -> cour.getRating()).count());

        //groupBy
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getGenre, Collectors.counting())));

        //group & compare
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getGenre, Collectors.maxBy(Comparator.comparing(Course::getRating)))));

        //mapping
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getGenre, Collectors.mapping(Course::getName, Collectors.toList()))));

        //primitivestreams
        //use boxed to int to list conversion
        System.out.println(IntStream.range(1,10).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.range(1,10).sum());

        //frequency of non repeated characters
        String name = "Sweetthhaa";
        String nonrepeated = Stream.of(name.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue()==1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(nonrepeated);





    }
}
