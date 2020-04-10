package lesson9.Ex4;

public class Formatter3 {
    String s;
    public Formatter3(String s){
        this.s=s;
    }

    @Override
    public String toString(){
        return "**************\n*\t"+s+"\t*\n**************";
    }
}
