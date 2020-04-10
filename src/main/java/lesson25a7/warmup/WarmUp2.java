package lesson25a7.warmup;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp2 {
    static class Pairs{
        int index;
        int sum;
        public Pairs(int index, int sum){
            this.index=index;
            this.sum=sum;
        }
    }
    public static void main(String[] args) {
        int[] data = new Random().ints(10,25).limit(10).toArray();

        Pairs pairs = IntStream.range(0, data.length-1).mapToObj(i -> new Pairs(i, data[i] + data[i + 1]))
                .min((p1, p2) -> p1.sum - p2.sum)
                .orElseThrow(RuntimeException::new);
        System.out.println(pairs.index);

        Map<Integer, List<Integer>> collect = new Random().ints(10, 25).limit(10)
                .boxed()
                .collect(Collectors.groupingBy(i -> i));

        Map.Entry<Integer, List<Integer>> integerListEntry = collect.entrySet().stream()
                .min(Comparator.comparingInt(o -> o.getValue().size()))
                .orElseThrow(RuntimeException::new);
        System.out.println(integerListEntry.getKey());

//        Map<Integer,Integer> repetition = new HashMap<>();
//        Arrays.stream(data).peek(value -> repetition.merge(value, 1, Integer::sum));
//        System.out.println(repetition.toString());

    }
}
