package lesson10.v1;

import java.util.List;

public class CharacterApp {
    public static void main(String[] args) {
        CharacterPosition app = new CharacterPosition();
        ListOfRes results = app.countUnique("Hello World");
        List<Character> letters = results.unique;
        List<Integer>  counts = results.counts;
        for(Character c:letters){
            System.out.printf("%s ",c);
        }
        System.out.println();
        for(Integer i:counts){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }

}
