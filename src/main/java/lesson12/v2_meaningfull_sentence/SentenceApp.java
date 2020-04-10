package lesson12.v2_meaningfull_sentence;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SentenceApp {
    public static void main(String[] args) {
//        Optional<Map<String, List<String>>> svo = read("subj_verb.txt");
//        Optional<Map<String, List<String>>> voo  = read("verb_obj.txt");
//        if(svo.isPresent() && voo.isPresent()){
//            List<Sentence> sentences = makeSentences(svo.get(), voo.get());
//            Optional<Boolean> write = write(sentences);
//            if(!write.isPresent()){
//                System.out.println("smt went wrong");
//            }
//        }
        read("subj_verb.txt").flatMap(sv->
                read("verb_obj.txt").map(vo->
                        makeSentences(sv,vo)))
                .ifPresent(SentenceApp::write);
    }

    private static Optional<Boolean> write(List<Sentence> sentences) {
        try{
            File file = new File("sentences.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Sentence line: sentences) {
                bw.write(line.toString());
                bw.write("\n");
            }
            bw.close();
            return Optional.of(true);
        }catch (IOException e){
            return Optional.empty();
        }
    }

    private static List<Sentence> makeSentences(Map<String, List<String>> sv, Map<String, List<String>> vo) {
        return sv.keySet().stream().flatMap(subj->
                sv.get(subj).stream().flatMap(verb->
                        vo.get(verb).stream().map(obj->new Sentence(subj,verb,obj)))).collect(Collectors.toList());
    }

    private static Optional<Map<String, List<String>>> read(String path){
        try {
            File file = new File(path);
            HashMap<String, List<String>> data = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.lines().forEach(line->{
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String[] value_dirty = parts[1].split(",");

                ArrayList<String> values = new ArrayList<>();
                for(String val:value_dirty){
                    values.add(val.trim());
                }
                data.put(key,values);
            });
            return Optional.of(data);
        }catch (IOException e){
            return Optional.empty();
        }
    }
}
