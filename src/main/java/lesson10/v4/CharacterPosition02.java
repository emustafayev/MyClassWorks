package lesson10.v4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterPosition02 {

    public List<Tuple> convert(Map<Character,List<Integer>> map){
        Stream<Map.Entry<Character, List<Integer>>> stream = map.entrySet().stream();
        return stream.map(characterListEntry -> new Tuple(characterListEntry.getKey(), characterListEntry.getValue()))
                     .collect(Collectors.toList());
    }

    public HashMap<Character, List<Integer>> Mapping(String origin){
        HashMap<Character, List<Integer>> data = new HashMap<>();
        List<Integer> position;
        for(int pos  = 0;pos<origin.length();pos++){
            char ch = origin.charAt(pos);
            data.merge(ch, Arrays.asList(pos), (integers, integers2) -> {
                List<Integer> list3 = new ArrayList<>();
                list3.addAll(integers);
                list3.addAll(integers2);
                return list3;
            });
        }
        return data;
    }
}
