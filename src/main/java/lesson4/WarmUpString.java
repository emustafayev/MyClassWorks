package lesson4;
// NOT A GOOD APPROACH;
import java.util.Random;

public class WarmUpString {
    public static void main(String[] args) {
        Random rand = new Random();
    StringBuilder str1 = new StringBuilder();

        String lowerLetters = "qwertyuioplkjhgfdsazxcvbnm";
        String upperLetters = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String mixedLetters = "QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm";
        String vowelsSmall = "aeiouy";
        String lettersConsonant = "qwrtpsdfghjklzxcvbnm";

        char[] smallLeters = lowerLetters.toCharArray();
        char[] capitalLetters = upperLetters.toCharArray();
        char[] mixedLettersArr = mixedLetters.toCharArray();
        char[] smallVowels = vowelsSmall.toCharArray();
        char[] smallConsonants = lettersConsonant.toCharArray();
        int index=0;

        str1.append("Small random: \n");
        SmallRandom(index,str1,rand,lowerLetters,smallLeters);
        str1.append("\nCapital Random: \n");
        CapitalRandom(index,str1,rand,upperLetters,capitalLetters);
        str1.append("\nMixed Random: \n");
        MixedRandom(index,str1,rand,mixedLetters,mixedLettersArr);
        str1.append("\nSmall vowels: \n");
        VoWelSmallRandom(index,str1,rand,vowelsSmall,smallVowels);
        str1.append("\nCapital vowels: \n");
        VoWelCapitalRandom(index,str1,rand,vowelsSmall,smallVowels);
        str1.append("\nSmall consonant: \n");
        ConsonantSmallRandom(index,str1,rand,lettersConsonant,smallConsonants);
        str1.append("\nCapital consonants: \n");
        ConsonantCapitalRandom(index,str1,rand,lettersConsonant,smallConsonants);


        System.out.println(str1);
    }


    //Functions  #################################################################################
    private static void ConsonantCapitalRandom(int index, StringBuilder str1, Random rand, String lettersConsonant, char[] smallConsonants) {
        for(int i=0;i<20;i++){
            index = rand.nextInt(lettersConsonant.length());
            str1.append(Character.toUpperCase(smallConsonants[index]));
        }
    }

    private static void ConsonantSmallRandom(int index, StringBuilder str1, Random rand, String lettersConsonant, char[] smallConsonants) {
        for(int i=0;i<20;i++){
            index = rand.nextInt(lettersConsonant.length());
            str1.append(smallConsonants[index]);
        }
    }

    private static void VoWelCapitalRandom(int index, StringBuilder str1, Random rand, String vowelsSmall, char[] smallVowels) {
        for(int i=0;i<20;i++){
            index = rand.nextInt(vowelsSmall.length());
            str1.append(Character.toUpperCase(smallVowels[index]));//use charat instead;
        }
//name, size,price, count
    }

    private static void VoWelSmallRandom(int index, StringBuilder str1, Random rand, String vowelsSmall, char[] smallVowels) {
        for(int i=0;i<20;i++){
            index = rand.nextInt(vowelsSmall.length());
            str1.append(smallVowels[index]);
        }

    }

    private static void MixedRandom(int index, StringBuilder str1, Random rand, String mixedLetters, char[] mixedLettersArr) {
        for (int i=0;i<35;i++){
            index = rand.nextInt(mixedLetters.length());
            str1.append(mixedLettersArr[index]);
        }
    }

    private static void CapitalRandom(int index, StringBuilder str1, Random rand, String upperLetters, char[] capitalLetters) {
        for (int i=0;i<25;i++){
            index = rand.nextInt(upperLetters.length());
            str1.append(capitalLetters[index]);
        }
    }

    private static void SmallRandom(int index, StringBuilder str1, Random rand, String lowerLetters, char[] smallLeters) {
        for (int i=0;i<30;i++){
            index = rand.nextInt(lowerLetters.length());
            str1.append(smallLeters[index]);
        }
    }
}
