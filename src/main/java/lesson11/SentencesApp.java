package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SentencesApp {
    public static void main(String[] args) {
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");
        List<Sentence> outcome = new ArrayList<>();
        for(String sbj:subjects){
            for (String verb:verbs) {
                for (String obj:objects) {
                    outcome.add(new Sentence(sbj,verb,obj));
                }
            }
        }

        List<Sentence> collected = subjects.stream().flatMap(sbj -> verbs.stream().flatMap(vrb -> objects.stream().map(obj -> new Sentence(sbj, vrb, obj)))).collect(Collectors.toList());

    }

    ///////////////////////////////////////
    private static List<String> list(String... items) {
        return Arrays.asList(items);
    }


}
