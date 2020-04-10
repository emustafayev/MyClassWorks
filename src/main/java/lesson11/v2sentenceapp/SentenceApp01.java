package lesson11.v2sentenceapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SentenceApp01 {
    public static void main(String[] args) {
        List<String> subject = list("Noel","The cat","the dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");
        subject.stream().flatMap(sbj ->
                verbs.stream().flatMap(vrb ->
                        objects.stream().map(obj ->
                                new Sentence(sbj, vrb, obj)))).collect(Collectors.toList()).forEach(System.out::println);

    }


    private static List<String> list(String... items) {
        return Arrays.asList(items);
    }
}
