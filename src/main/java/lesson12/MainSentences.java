package lesson12;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MainSentences {
    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> reader_subj_verb = reader("subj_verb.txt");
        HashMap<String, List<String>> reader_verb_obj = reader("verb_obj.txt");


        List<Sentence> outcome = new ArrayList<>();

//        List<Sentence> collect = reader_subj_verb.entrySet().stream()
//                .flatMap(stringListEntry1 -> stringListEntry1.getValue().stream()
//                .flatMap(verbs -> reader_verb_obj.entrySet().stream()
//                        .flatMap(stringListEntry2 -> stringListEntry2.getValue()
//                                .stream().map(subj -> new Sentence(stringListEntry1.getKey(), verbs, subj))))).collect(Collectors.toList());

        List<Sentence> collect = reader_subj_verb.keySet().stream()
                .flatMap(subject -> reader_subj_verb.get(subject.trim()).stream()
                        .flatMap(verb -> reader_verb_obj.get(verb.trim()).stream()
                                .map(object -> new Sentence(subject, verb, object)))).collect(Collectors.toList());

        collect.forEach(System.out::println);

    }

    public static  HashMap<String, List<String>> reader(String path) throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader r = new BufferedReader(fr);
        HashMap<String, List<String>> data = new HashMap<>();
//        Stream<String> lines = r.lines();
        String line;
        while ((line=r.readLine())!=null) {
            String[] splited = line.split(":");
            List<String> collect = Arrays.stream(splited[1].split(",")).collect(Collectors.toList());
            data.put(splited[0],collect);
        }
        return data;
    }
}