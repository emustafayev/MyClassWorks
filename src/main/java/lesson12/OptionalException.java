package lesson12;

import java.util.Optional;

public class OptionalException {
    public static void main(String[] args) {
        Optional<Integer> value1 = strToInt("123");
        Optional<Integer> value2 = strToInt("123d");
        String str = strToInt("1")
                .map(x->x+10)
                .map(x-> String.format("%d",x))
                .orElse("Not a number");
        System.out.println(str);

    }

    private static Optional<Integer> strToInt(String s) {
        try{
            return Optional.of(Integer.parseInt(s));
        }catch (Exception e){
            return Optional.empty();
        }
    }
}
