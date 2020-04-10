package lesson9.Streams.functionalInterface;

import java.util.Random;


public interface Interface1 {
    String s = "Interface2";

    static void method1(){
        System.out.println(s);
    }

    default String method2(String x){
        return s+x;
    }
    default int getNumber(){
        return (new Random()).nextInt(100);
    }

    default String M1(){
        return getNumber()+s;
    }

    void method3();

    default void mothod4() {//doesnt have to be overridden by an implementing class

    }


}
