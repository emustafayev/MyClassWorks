package lesson9.Ex2;

public class Formatter1 implements Formatter0 {
    @Override
    public String format(String s) {
        return s.toLowerCase();
    }

    @Override
    public void print(String s) {
        System.out.println(this.format(s));
    }
}
