package lesson9.Ex1;

public class FormatterApp1 {

    public static void print(String s,Formatter0 formatter){
        System.out.println(formatter.format(s));
    }

    public static void main(String[] args) {
        Formatter0 fmt1 = new Formatter1();
        Formatter0 fmt2 = new Formatter2();
        Formatter0 fmt3 = new Formatter3();

        print("Hello",fmt1);
        print("Hello",fmt2);
        print("Hello",fmt3);
    }
}
