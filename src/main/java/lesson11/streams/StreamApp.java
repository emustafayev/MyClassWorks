package lesson11.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Jessica", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Bob", Gender.MALE),
                new Person("Madina", Gender.FEMALE),
                new Person("Aisha", Gender.PREFER_NOT_TO_SAY)
                );
        List<Integer> collect = list.stream().map(person -> person.name)
                .mapToInt(String::length).boxed().collect(Collectors.toList());
        System.out.println(collect);

        list.stream().filter(person -> person.gender== Gender.MALE)
                .collect(Collectors.toList())
                .forEach(person -> System.out.println(person.name));

        Optional<String> opt;

    }

    static class Person{
        private final String name;
        private final Gender gender;
        private int age;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        Person(String name, Gender gender,int age){
            this(name, gender);
            this.age=age;
        }
    }


    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
