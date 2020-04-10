package lesson10.v2;

import java.util.HashMap;

public class CharacterApp {
    public static void main(String[] args) {
        CharacterPosition02 app = new CharacterPosition02();
        HashMap<Character, Integer> result = app.Mapping("Hello World");
        result.forEach((character, integer) -> System.out.printf("%c %d\n", character, integer));

    }
}
