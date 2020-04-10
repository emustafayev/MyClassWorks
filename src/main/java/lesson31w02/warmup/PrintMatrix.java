package lesson31w02.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintMatrix {

  public static String dataOrdered(int R, int C, int[][] m) {
    int col=C-1;
    int row=0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; row < R && col<C; i++) {
      if (col==C){
        row++;
      }
      if (row%2==1){
        col--;
      }
      sb.append(m[row][C-1-col]);


    }
    return sb.toString();
  }

  public static void main(String[] args) {
    List<Integer> res = new ArrayList<>();
    int[][]a =
        {
        {  1,  2,  3 },
        {  5,  6,  7 },
        {  9, 10, 11 },
        { 13, 14, 15 },
        { 17, 18, 19 },
        { 21, 22, 23 },
    };


    System.out.println(dataOrdered(a.length, a[0].length, a));
    // 1 2 3 7 6 5 9 10 11 15 14 13 17 18 19 23 22 21
  }
}
