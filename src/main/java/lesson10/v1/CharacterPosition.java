package lesson10.v1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CharacterPosition {

    public ListOfRes countUnique(String origin){
        List<Character> unique = getUnique(origin);
        List<Integer> counts = countAll(origin,unique);
        return new ListOfRes(unique,counts);
    }

    private List<Integer> countAll(String origin, List<Character> unique) {
            List<Integer> count_list  = new ArrayList<>();
            for(Character ch:unique){
                int count = countOne(origin,ch);
                count_list.add(count);
            }
            return count_list;
    }

    private int countOne(String origin, Character ch) {
        int count = 0;
        for(int i=0;i<origin.length();i++ ){
            if(origin.charAt(i)==ch){
                count+=1;
            }
        }
        return count;
    }

    private List<Character> getUnique(String origin) {
        HashSet<Character> unique_hs = new HashSet<>();
        for(int i=0;i<origin.length();i++){
            unique_hs.add(origin.charAt(i));
        }
        return new ArrayList<>(unique_hs);
    }
}
