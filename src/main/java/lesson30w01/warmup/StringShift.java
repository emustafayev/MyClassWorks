package lesson30w01.warmup;

public class StringShift {
  public static String shift(String orig, int toLeft, int toRight) {
    int len = orig.length();
    int total = (toLeft-toRight)%len;           //  Afgan
    int middle = (total > 0) ? len - total : -total;


    throw new IllegalArgumentException();

  }
  public static void main(String[] args) {
    System.out.println(shift("abcd",3,1));

  }

}
