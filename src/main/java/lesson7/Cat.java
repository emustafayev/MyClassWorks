package lesson7;

public class Cat extends Animal {



    public Cat(String name) {
        super(name);
        super.move();
    }


    @Override
    public String toString(){
        return "Hello Im cat My name is " + name;
    }
}
