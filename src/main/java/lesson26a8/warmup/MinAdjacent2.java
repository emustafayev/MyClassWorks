package lesson26a8.warmup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class MinAdjacent2 {
    static class Pairs{
        int index;
        int sum;
        public Pairs(int index, int sum){
            this.index=index;
            this.sum=sum;
        }
    }

    public static void main(String[] args) {
        int[] data = new Random().ints(15, 35).limit(15).toArray();
        System.out.println(Arrays.toString(data));
        Pairs pairs = IntStream.range(0, data.length-1)
                .mapToObj(i -> new Pairs(i, data[i] + data[i + 1]))
                .min(Comparator.comparingInt(p -> p.sum))
                .orElseThrow(RuntimeException::new);

        IntStream.range(0, 3).forEach(System.out::println);

        System.out.println(pairs.index);
        System.out.println(data[pairs.index]);
        System.out.println(data[pairs.index+1]);
        System.out.println(pairs.sum);
    }
}
