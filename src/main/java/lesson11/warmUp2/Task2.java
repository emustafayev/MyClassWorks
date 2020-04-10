package lesson11.warmUp2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> randomList = new Random().ints(20, -10, 10).boxed().collect(Collectors.toList());
        List<String> collect = randomList.stream()
                .filter(x -> x > 0).map(Math::sqrt)
                .map(d -> String.format("%.3f", d))
                .collect(Collectors.toList());

        System.out.println(randomList);
        System.out.println(collect);

    }
}
