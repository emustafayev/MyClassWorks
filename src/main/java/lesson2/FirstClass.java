package lesson2;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    if(count<18){
        System.out.println("Go to the cinema");
    }else{
        System.out.printf("Go to the night club");
    }
    }
}
