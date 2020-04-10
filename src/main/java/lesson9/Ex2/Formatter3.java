package lesson9.Ex2;

public class Formatter3 implements Formatter0 {
    @Override
    public String format(String s) {
        return  "**************\n*\t"+s+"\t*\n**************";
    }

    @Override
    public void print(String s) {
        System.out.println(format(s));
    }
}
