package lesson24a6;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class BiarySearchApp2 {
    static  int[] array = new Random().ints(0,100000).limit(10000).toArray();
    static  int[] sorted = array.clone();

    static public class Result{
        Optional<Integer> index;
        int iterations;
        public Result(Optional<Integer> index, int count){
            this.index=index;
            this.iterations=count;
        }
    }

    public static void main(String[] args) {
        Arrays.sort(sorted);
        int number = sorted[(int) (Math.random() * sorted.length)];
        Result binary = find_binary(sorted, number);
        System.out.printf("%d %d\n",binary.index.get(), binary.iterations);
        int binaryR = findBinary(sorted, number);
        System.out.println(binaryR);
    }

    public static int findBinary(int[] origin, int number){
        int l = 0;
        int r=origin.length-1;
        int m = (l+1)/2;
        return findBinaryR(l,m,r,origin,number);
    }

    private static int findBinaryR(int l,int m, int r,int[] origin, int number){
        if (l==r) return -1;
        if (origin[m]==number) return m;
        else if (origin[m]>number) r=m+1;
        else l= m-1;
        m=(l+r)/2;
        return findBinaryR(l,m,r,origin,number);
    }

    private static Result find_binary(int[] origin, int number) { //1 2 3 4 5 6 7
        int l = 0;
        int r = origin.length-1;
        int counter=0;
        while (l<r){
            counter++;
            int m = (l+r)/2;
            if (origin[m]==number) return new Result(Optional.of(m),counter);
            else if(origin[m]>number) r = m+1;
            else l=m-1;
        }
        return new Result(Optional.empty(),counter);
    }
}
