package lesson26a8.warmup;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class MinAdjacentPair {
    static class Pair{
        int sum=0;
        int index=0;
        public Pair(int index,int sum){
            this.index=index;
            this.sum=sum;
        }
    }

    public static void main(String[] args) {
        int[] data = new Random().ints(20, 35).limit(10).toArray();
        System.out.println(Arrays.toString(data));
        int MIN = Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < (data.length - 1); i++) {
            if((data[i]+data[i+1])<MIN){
                MIN = data[i]+data[i+1];
                index=i;
            }
        }
        System.out.println(MIN);
        System.out.println(data[index]);
        System.out.println(data[index+1]);
        System.out.println(index);
        System.out.println();

        Pair pair = IntStream.range(0, (data.length - 1)).mapToObj(idx -> new Pair(idx, data[idx] + data[idx + 1]))
                .min((p1, p2) -> p1.sum - p2.sum).orElseThrow(()->new RuntimeException("Cant be empty"));

        System.out.println(pair.index);
        System.out.println(pair.sum);
        System.out.println(data[pair.index]);
        System.out.println(data[pair.index+1]);
    }
}
