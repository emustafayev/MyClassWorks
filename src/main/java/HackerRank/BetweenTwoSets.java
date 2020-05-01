package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2, 4);
        List<Integer> l2 = Arrays.asList(16, 32, 96);
        betweenTwo(l1,l2);
    }

    private static int betweenTwo(List<Integer> a, List<Integer> b) {
        int counter = 0;
        int maxOfA = a.stream().max(Comparator.comparingInt(x -> x)).orElseThrow(RuntimeException::new);
        int minOfB = b.stream().min(Comparator.comparing(x -> x)).orElseThrow(RuntimeException::new);

        List<Integer> factorOfB = new ArrayList<>();


        throw new IllegalArgumentException();
    }
}
