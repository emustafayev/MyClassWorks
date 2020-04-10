package lesson9.Ex3;

public class Formatter2 extends Formatter0 {

    public Formatter2(Formatter3 classFormat3){
        classFormat3.s = classFormat3.s.toUpperCase();
        System.out.println(classFormat3);
    }
    public Formatter2(String s){
        this.s=s;
    }

    @Override
    public String toString(){
        return s.toUpperCase();
    }
}
