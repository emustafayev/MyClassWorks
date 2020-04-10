package lesson5;

import java.util.Arrays;
import java.util.Random;

public class ShiftNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[6];
        for(int i=0;i<array.length-1;i++){
            array[i] = rand.nextInt(201)-100;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[i]>0){
                    if(array[i]>array[j] && array[j+1]>0){
                        int temp = array[j+1];
                        array[j+1] = array[i];
                        array[i]=temp;
                    }
                }else if(array[i]<0){
                    if(array[i]<array[j] && array[j+1]<0){
                        int temp = array[j+1];
                        array[j+1] = array[i];
                        array[i]=temp;
                    }
                }

            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }



}
