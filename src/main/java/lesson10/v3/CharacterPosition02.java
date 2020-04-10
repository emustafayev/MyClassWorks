package lesson10.v3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharacterPosition02 {

    public HashMap<Character, List<Integer>> Mapping(String origin){
        HashMap<Character, List<Integer>> data = new HashMap<>();
        List<Integer> position = new ArrayList<>();
        for(int pos  = 0;pos<origin.length();pos++){
            char ch = origin.charAt(pos);
            position = data.getOrDefault(ch,new ArrayList<>());
            position.add(pos);
            data.put(ch,position);
        }
        return data;
    }
}
