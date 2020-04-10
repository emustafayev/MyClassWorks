package lesson20;

import java.util.Arrays;

public class MergeSortExplained {
    public static void main(String[] args) {
        int[] data1 = {2,4,6};
        int[] data2 = {3,5};
        System.out.println(Arrays.toString(merge(data1, data2)));
    }
    static int[] merge(int [] data1, int[] data2){
        int[] mergedArr = new int[data1.length+data2.length];
        int indx1 = 0;
        int indx2 = 0;
        int indx = 0;
        while (indx1<data1.length && indx2<data2.length){
            mergedArr[indx++] = data1[indx1]<data2[indx2]?data1[indx1++]:data2[indx2++];
        }
        while (indx1<data1.length){
            mergedArr[indx++] = data1[indx1++];
        }
        while (indx2<data2.length){
            mergedArr[indx++] = data2[indx2++];
        }
        return mergedArr;
    }
}