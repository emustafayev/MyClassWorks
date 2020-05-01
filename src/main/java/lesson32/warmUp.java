package lesson32;

import java.util.ArrayList;
import java.util.List;

public class warmUp {

    public static String dataOrdered(int R, int C, int[][] m) {
        int col = C-1;
        int row = 0;
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < R * C; idx++) {
            int col_r = idx/R;
            int shift = idx % R;
            row = (col_r&1)==0?shift:R-1-shift;
            col = C-1-col_r;
            sb.append(m[row][shift]);
            System.out.println(m[row][col]);


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        int[][] a =
                {
                        {1,  2,  3},
                        {5,  6,  7},
                        {9,  10, 11},
                        {13, 14, 15},
                        {17, 18, 19},
                        {21, 22, 23},
                };


        System.out.println(dataOrdered(a.length, a[0].length, a));
    }
}