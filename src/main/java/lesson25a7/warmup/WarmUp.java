package lesson25a7.warmup;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WarmUp {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> collect = new Random()
                .ints(10, 35).limit(10)
                .boxed()
                .collect(Collectors.groupingBy(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer;
                    }
                }))
                ;
    }
}
