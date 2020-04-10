package lesson24a6.casting;

import java.util.*;
import java.util.stream.Collectors;

public class Casting {
    static void testNumericPromotion(){
        char char1='1',char2='2';
        short short1='A', short2=2;
        int int1=1,int2=2;
        float float1=1.0f,float2=2.0f;
        int i = char2 + char1;
        char ch = 65;
        System.out.println(short1);
    }

    public static void main(String[] args) {
        testNumericPromotion();
        Object obj = Calendar.getInstance();
        long time=0;
        int i = 034;
        int i1 = 214748364;
        char heart = '\u2764';
        System.out.println(heart);
        float f1 = 1.0f;
        float f2 = 1.0f;
        System.out.println(Float.POSITIVE_INFINITY/Float.NEGATIVE_INFINITY);
        System.out.println(f1/f2);

        new Random().ints(10,35).limit(10).boxed().collect(Collectors.toList());


    }
    int findMinOccureance(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            map.put(arr[j],0);
            for (int k = j+1; k < arr.length; k++) {
                if (arr[j]==arr[k]){
                    int counter = map.get(j)+1;
                    map.put(arr[j],counter);
                }
            }
        }
        int minimal=0;
        List<Integer> collect = map.values().stream().sorted(Comparator.comparingInt(i -> i)).collect(Collectors.toList());
        for (int i = 0; i < map.size(); i++) {
            if(map.get(i).equals(collect.get(0))){
                minimal=collect.get(i);
                break;
            }
        }
        return minimal;
    }




}