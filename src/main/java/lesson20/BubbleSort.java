package lesson20;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,6,1,9,34,32,45,23};
        System.out.println(Arrays.toString(bubleSort1(arr)));
    }
    static int[] bubleSort1(int[] data){//best version so far, so good
        int[] sorted_arr = data.clone();
        for(int i=0;i<sorted_arr.length;i++){
            for (int j = i+1; j < sorted_arr.length; j++) {
                if(sorted_arr[i]<sorted_arr[j]){
                    int temp = sorted_arr[i];
                    sorted_arr[i] = sorted_arr[j];
                    sorted_arr[j]=temp;
                }
            }
            System.out.println(Arrays.toString(sorted_arr));
        }
        return sorted_arr;
    }
}
