package lesson9.Ex4;

public class Formatter2 {

        public Formatter2(Formatter3 clazz){
            clazz.s = clazz.s.toUpperCase();
            System.out.println(clazz);
        }
}
