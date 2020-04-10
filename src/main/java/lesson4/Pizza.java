package lesson4;

public class Pizza {
    public static void main(String[] args) {

    }
    static int count=0;
    String name;
    float price;
    String size;

    public Pizza(String name,Float price,String size ){
        this.name = name;
        this.price = price;
        this.size = size;
        Pizza.count+=1;
    }

    public void getString(){
        System.out.println(String.format("Name: %s Float: %f Size: %s",this.name,this.price, this.size ));
    }
}
