package lesson32w03.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class PrintDiagonal {
  public static void main(String[] args) {
    int[][]a = {
        {  1,  2,  3,  4, },
        {  5,  6,  7,  8, },
        {  9, 10, 11, 12, },
        { 13, 14, 15, 16, },
        { 17, 18, 19, 20, },
        { 21, 22, 23, 24, },
        { 25, 26, 27, 28, },
    };
    //System.out.println(traverse(a.length, a[0].length, a));

    Map<String,String> test = new HashMap<>();
    String put = test.put("dwf", "wefwef");
    System.out.println(put);
  }

  private static String traverse(int R, int C, int[][] a) {
    int j=0;
    int i=0;
    int level=0;
    StringBuilder sj = new StringBuilder();
    for (int k = 0; k < R * C; k++) {
      sj.append(a[i][j]);
      System.out.println(a[i][j]);
      if (i==0){
        j++;
        level++;
      }
       if (j==0){
        level++;
        i++;
      }
      System.out.println(a[i][j]);

      if (level%2==0){
        i--;
        j++;
      }else {
        i++;
        j--;
      }
    }
    return sj.toString();
  }
}
