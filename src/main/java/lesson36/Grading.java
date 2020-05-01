package lesson36;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Grading {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(73, 67, 38, 33);
        System.out.println(roundGrades(list));
    }


    private static List<Integer> roundGrades(List<Integer> list) {
        //Grading
        return list.stream()
                .map(el -> el<38 ? el : (el%5) > 2 ? (el/5+1)*5:el)
                .collect(toList());
    }

}
