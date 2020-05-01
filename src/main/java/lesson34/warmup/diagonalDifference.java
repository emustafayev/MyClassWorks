package lesson34.warmup;

import java.util.stream.IntStream;

public class diagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {5,6,7},
                {9,10,11}
        };
        System.out.println(findDiff(arr,3));
    }

    private static int findDiff(int[][] arr, int size){
        return IntStream.range(0,size).map(x->
                arr[x][x]-arr[x][size-x-1])
                .sum();
    }
}
