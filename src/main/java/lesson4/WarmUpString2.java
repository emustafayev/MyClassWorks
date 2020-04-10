package lesson4;

import java.util.Random;

public class WarmUpString2 {

    public static boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isSmall(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isLetter(char c) {
        return isCapital(c) || isSmall(c);
    }

    public static boolean isVowel(char c) {
        final String vowels = "aeoiu";
        return vowels.indexOf(Character.toLowerCase(c)) >= 0;
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }


    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder str1 = new StringBuilder();
        str1.append("Small Random: \n");
        smallRandom(rand,str1);
        str1.append("\nCapital Random: \n");
        capitalRandom(rand, str1);
        str1.append("\nVowel small: \n");
        vowelSmallRandom(rand, str1);
        
        System.out.println(str1);
        
        
    }

    private static void vowelSmallRandom(Random rand, StringBuilder str1) {
        for (int i = 0; i <20 ; ) {
            int ch = rand.nextInt(123-65)+65;
            if(isVowel( (char)ch)){
                str1.append(Character.toLowerCase((char)ch));
                i++;
            }
        }
    }

    private static void capitalRandom(Random rand, StringBuilder str1) {
        for (int i = 0; i < 25; i++) {
            int num = rand.nextInt(91-65)+65;
            str1.append((char)num);
        }
    }

    private static void smallRandom(Random rand, StringBuilder str1) {
        for (int i = 0; i < 30; i++) {
            int num = rand.nextInt(123-97)+97;
            str1.append((char)num);
        }
    }
}
