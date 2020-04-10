package lesson5;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] odd = new int[N];
        int[] even = new int[N];

        odd = fillArray(odd,1);
        even = fillArray(even,0);


        int evenCount = even.length-1;
        int oddCount = odd.length-1;

        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));


        int[] FullArray = new int[N*2];

        for(int i=0;i<FullArray.length;i++){
            if(i%2==1){
                FullArray[i]=even[even.length-evenCount-1];//i*2;
                evenCount--;
            }else{
                FullArray[i] = odd[odd.length-oddCount-1];//i*2+1;
                oddCount--;
            }
        }
        System.out.println(Arrays.toString(FullArray));
    }

    private static int[] fillArray(int[] arr, int k) {
        Random rand = new Random();

        for(int i=0;i<arr.length;){
            int number = rand.nextInt(101);
            if(k==0){
                if(number%2==0){
                    arr[i++] = number;
                }
            }else {
                if(number%2==1){
                    arr[i++] = number;
                }
            }
        }
        return arr;
    }
}
