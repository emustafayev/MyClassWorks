package lesson10.v4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterApp {
    public static void main(String[] args) {
    CharacterPosition02 app = new CharacterPosition02();
        HashMap<Character, List<Integer>> result = app.Mapping("Hello World");

        //result.forEach((character, integers) -> System.out.printf("%c  %s\n",character,integers));
        List<Tuple> converted = app.convert(result);
        Consumer<Tuple> print = tuple -> System.out.printf("%c  %s\n",tuple.ch,tuple.list);
        Comparator<Tuple> c1 = Comparator.comparingInt(o -> o.list.get(0));
        Comparator<Tuple> c2 = (o1, o2) -> o1.ch-o2.ch;
        Comparator<Tuple> c3 = new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                return o2.list.size()-o1.list.size();
            }
        };
        converted.sort(c1);
        converted.forEach(print);
        System.out.println("----------");
        Collections.sort(converted,c2);
        converted.forEach(print);
        System.out.println("----------");
        Collections.sort(converted,c3);
        converted.forEach(print);
        System.out.println("----------");
        List<Integer> collect = IntStream.range(0, 11).boxed().collect(Collectors.toList());
        Comparator<Integer> c_test = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
       Collections.sort(collect,c_test);
       Consumer<Integer> print_test = new Consumer<Integer>() {
           @Override
           public void accept(Integer integer) {
               System.out.printf("%d ",integer);
           }
       };
        collect.forEach(print_test);
    }
}
