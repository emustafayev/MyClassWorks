package lesson22;

import java.util.Arrays;
import java.util.Random;

public class sumArray {
    static int total=0;
    static int k=0;
    static int sum(int[] data){

        if(k>=data.length){
            return total;
        }
        total+=data[k];
        int[] result = Arrays.copyOf(data,data.length-1);
        System.arraycopy(data, k, result,0, data.length-k-1);
        k++;

        return sum(result);
    }

    public static void main(String[] args) {
        int[] d = new Random().ints(1,20).limit(5).toArray();
        System.out.println(Arrays.toString(d));
        System.out.println(sum(d));
    }
}
