package lesson28snake.algorithms02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AStarApp {
    public static void main(String[] args) {
        AStar aStar = new AStar(20,20);
        List<APoint> obstacles = Arrays.asList(APoint.of(3,1),APoint.of(3,2),APoint.of(3,3),APoint.of(2,3),APoint.of(1,3));
        Optional<Object> trace = aStar.trace(APoint.of(2, 2), APoint.of(18, 18), obstacles);
        System.out.println(trace);
    }
}
