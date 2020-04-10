package lesson20;

import java.util.*;
import java.util.stream.Collectors;

class MergeApp {
    static int[] merge(int[] data1, int[] data2) {
        int[] data3 = new int[data1.length + data2.length];
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        while (idx1 < data1.length && idx2 < data2.length) {
            data3[idx3++] = (data1[idx1] < data2[idx2]) ? data1[idx1++] : data2[idx2++];
        }
        while (idx1 < data1.length) {
            data3[idx3++] = data1[idx1++];
        }
        while (idx2 < data2.length) {
            data3[idx3++] = data2[idx2++];
        }
        return data3;
    }


    public static List<Apple> mergeApples(List<Apple> list1, List<Apple> list2) {
        int idxL1 = 0;
        int idxL2 = 0;
        List<Apple> appleList = new ArrayList<>();

        while(idxL1<list1.size() && idxL2<list2.size()){
            if ((list1.size()-list2.size())<0){
                appleList.add(list1.get(idxL1++));
            }else {
                appleList.add(list2.get(idxL2++));
            }
        }
        while (idxL1<list1.size()){
            appleList.add(list1.get(idxL1++));
        }
        while (idxL2<list2.size()){
            appleList.add(list2.get(idxL2++));
        }
        return appleList;
    }

    public static void main(String[] args) {
        Comparator<Apple> appleComparator = (o1, o2) -> o1.size - o2.size;

        List<Apple> apples1 = new Random().ints(10, 30).limit(10)
                .mapToObj(n -> new Apple(n)).sorted(appleComparator).collect(Collectors.toList());
        List<Apple> apples2 = new Random().ints(10, 30).limit(10)
                .mapToObj(n -> new Apple(n)).sorted(appleComparator).collect(Collectors.toList());
        System.out.println(apples1);
        System.out.println(apples2);

        List<Apple> apples3 = mergeApples(apples1, apples2);
        System.out.println(apples3);

        int[] d1 = {1,2,3};
        int[] d2 = {10,11}; // 1,2,3,10,11
        System.out.println(Arrays.toString(merge(d1,d2)));
        int[] d1a = {1,3,5};
        int[] d2a = {2,4};  // 1,2,3,4,5
        System.out.println(Arrays.toString(merge(d1a,d2a)));
    }
}
