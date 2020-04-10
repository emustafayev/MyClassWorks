package lesson9.Ex3;

public class Formatter3 extends Formatter0 {

    public Formatter3(String s){
        this.s=s;
    }

    @Override
    public String toString(){
        return "*************\n*\t"+s+"\t*\n*************";
    }
}
