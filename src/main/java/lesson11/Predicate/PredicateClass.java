package lesson11.Predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        String phone1 = "0700000000000";
        String phone2 = "0900000000000";
        String phone3 = "0900000003000";
        System.out.println(prdc1.and(prdc2).test(phone1));

        fnc.apply("zero");
    }
    static Predicate<String> prdc1 = phone -> phone.startsWith("070");
    static Predicate<String> prdc2 = phone -> phone.contains("3");


    static Function<String, Integer> fnc = new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return s.equals("zero") ?0:1;
        }
    };
}
