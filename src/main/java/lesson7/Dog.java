package lesson7;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return String.format("Hello, I'm %s",this.name);
    }
}
