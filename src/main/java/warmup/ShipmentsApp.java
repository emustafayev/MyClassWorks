package warmup;

import java.util.Arrays;

public class ShipmentsApp {

  static int fix(int[] w) {
    int total = Arrays.stream(w).sum();
    int eachShip = total/w.length;
    return  total%w.length!=0 ? -1 : Arrays.stream(w).map(x -> x-eachShip).filter(x -> x>0).sum();
  }

  public static void main(String[] args) {
    int[] a1 = {1,1,1,1,6};
    int[] a2 = {1,1,1,1,16};
    int[] a3 = {1,1,1,1,15};
    int[] a4 = {10,20,2,3,15};
    System.out.println(fix(a1)); // 4
    System.out.println(fix(a2)); // 12
    System.out.println(fix(a3)); // -1
    System.out.println(fix(a4)); // 15
  }
}
