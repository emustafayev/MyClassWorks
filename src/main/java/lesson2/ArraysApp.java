package lesson2;

import java.util.Arrays;
import java.util.Random;

public class ArraysApp {
    public static void main(String[] args) {
        //Random
        //RandomGenerate();
        //FIZZ BUZZ
        //FizzBuzz();
        //Even Odd Numbers
        EvenOdd();
    }

    private static void EvenOdd() {
        int[] arr = new int[30];
        int MIN = -100;
        int MAX = 100;
        Random random = new Random();
        for(int i=0;i< arr.length;i++){
            int r = random.nextInt(MAX - MIN) + MIN;
            arr[i]=r;
        }
        //Stream.generate(()->(int)(Math.random()*200-100)).limit(30).collect(Collectors.groupingBy(n -> n<0 ? n%2==0
        //        "NE":"NO":n%2==0? "PE":"PO"))

        //Stream.generate(()->(int)(Math.random()*200-100)).limit(30).collect(Collectors.groupingBy(n -> n<0 ? n%2==0? "NE":"NO":n%2==0? "PE":"PO").forEach(k,v)->System.out.println("%s %s\n",k,v));

        int count_pe=0,count_ne=0,count_po=0,count_no=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0 ){
                if(arr[i]%2==0) count_ne++;
                    else count_no++;
            }else{
                if(arr[i]%2==0) count_pe++;
                    else count_po++;
            }
        }
        int[] ne = new int[count_ne];
        int[] no = new int[count_no];
        int[] pe = new int[count_pe];
        int[] po = new int[count_po];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 ){
                if(arr[i]%2==0) ne[ne.length- count_ne--] = arr[i];
                else no[no.length - count_no--] = arr[i];
            }else{
                if(arr[i]%2==0) pe[pe.length-count_pe--] = arr[i];
                else po[po.length-count_po--] = arr[i];
            }
        }
        String originAsString = Arrays.toString(arr);
        System.out.println(originAsString);
        System.out.println(Arrays.toString(ne));
        System.out.println(Arrays.toString(no));
        System.out.println(Arrays.toString(pe));
        System.out.println(Arrays.toString(po));

    }





    private static void RandomGenerate() {
        float [] a = new float[20];
        int MAX = 10;
        for(int i=0;i<a.length;i++){
            float r = (float)(Math.random()*(MAX+1));//[0:11)
            a[i]=r;
            System.out.printf("%f\n",r);
        }
    }

    private static void FizzBuzz() {
        int COUNT=13;
        for(int i=0;i<COUNT;i++){
            if(i%2 == 0 || i%3==0){
                System.out.println("FIZZZ BUZZZ!");
            }else if(i%3==0){
                System.out.println("BUZZZ!");
            }else if(i%2==0){
                System.out.println("FIZZ!");
            }else{
                System.out.println("UNOperable!");
            }
        }

    }

}
