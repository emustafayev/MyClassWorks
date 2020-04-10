package lesson7;

public class Animal {
    String name;
    public void move(){
        System.out.println("I can move!");
    }

    public Animal(String name){
        name = name.toUpperCase();
        this.name=name;
        this.name = "\""+this.name+"\"";
    }

}
