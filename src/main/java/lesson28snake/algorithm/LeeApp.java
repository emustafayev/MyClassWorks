package lesson28snake.algorithm;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeeApp {
    public static void main(String[] args) {
        List<LPoint> obstacles = obstacles();
        Lee lee = new Lee(20,20);
        Optional<List<LPoint>> trace = lee.trace(LPoint.of(0, 0), LPoint.of(14, 16), obstacles);
        System.out.println(trace);
    }


    private static Stream<LPoint> horAt(int y, int x_from, int x_to) {
        return IntStream.rangeClosed(x_from, x_to).mapToObj(x -> LPoint.of(x, y));
    }

    private static Stream<LPoint> verAt(int x, int y_from, int y_to) {
        return IntStream.rangeClosed(y_from, y_to).mapToObj(y -> LPoint.of(x, y));
    }

    public static List<LPoint> obstacles() {
        return Stream.of(
                verAt(7, 0, 7),
                horAt(7, 0, 1),
                horAt(7, 3, 6),
                verAt(15, 1, 14)
        ).flatMap(x -> x).collect(Collectors.toList());
    }
}
