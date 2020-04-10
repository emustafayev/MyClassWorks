package lesson9.Ex2;

public class Formatter2 implements Formatter0 {
    @Override
    public String format(String s) {
        return s.toUpperCase();
    }

    @Override
    public void print(String s) {
        System.out.println(format(s));
    }
}
