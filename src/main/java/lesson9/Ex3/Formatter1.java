package lesson9.Ex3;

public class Formatter1 extends Formatter0 {
    public Formatter1(Formatter3 classFormat3){
        classFormat3.s = classFormat3.s.toLowerCase();
        System.out.println(classFormat3);
    }
    public Formatter1(String s){
        this.s=s;
    }

    @Override
    public String toString(){
        return s.toLowerCase();
    }
}
