package lesson10.v3;

import lesson10.v4.Tuple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class CharacterApp {
    public static void main(String[] args) {
    CharacterPosition02 app = new CharacterPosition02();
        HashMap<Character, List<Integer>> result = app.Mapping("Hello World");
        result.forEach((character, integers) -> System.out.printf("%c  %d %s\n",character,integers.size(),integers));
        System.out.println();
        Stream<Map.Entry<Character, List<Integer>>> stream = result.entrySet().stream();
        stream.map(new Function<Map.Entry<Character, List<Integer>>, Tuple>() {
            @Override
            public Tuple apply(Map.Entry<Character, List<Integer>> characterListEntry) {
                return null;
            }
        });
        System.out.println();

    }
}
