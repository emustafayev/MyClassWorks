package lesson10.v2;

import java.util.HashMap;

public class CharacterPosition02 {

    public HashMap<Character, Integer> Mapping(String origin){
        HashMap<Character, Integer> data = new HashMap<>();
        for (int i = 0; i < origin.length(); i++) {
            char ch = origin.charAt(i);
            //int count = data.getOrDefault(ch, 0);
            data.merge(ch, 1, Integer::sum);
        }
        return data;
    }
}
