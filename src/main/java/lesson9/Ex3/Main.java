package lesson9.Ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Formatter1("Hello"));  // hello
        System.out.println(new Formatter2("Hello"));  // HELLO
        System.out.println(new Formatter3("Hello"));  // ***********
                                                         // *  Hello  *
                                                         // ***********

        System.out.println();
        System.out.println();

        new lesson9.Ex3.Formatter2(new lesson9.Ex3.Formatter3("Hello")); // ***********

        new lesson9.Ex3.Formatter1(new lesson9.Ex3.Formatter3("Hello")); // ***********

    }
}
