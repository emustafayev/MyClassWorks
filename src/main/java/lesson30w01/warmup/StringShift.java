package lesson30w01.warmup;

public class StringShift {
  public static String shift(String orig, int toLeft, int toRight) {

    int len=orig.length();
    int total = (toLeft-toRight)%len;
  if (total==0) return orig;

  int shift = total < 0 ? -total:len-total;
  return orig.substring(shift,orig.length()).concat(orig.substring(0,shift));
  }
  public static void main(String[] args) {
    System.out.println(shift("abcd",3,1));

  }

}
