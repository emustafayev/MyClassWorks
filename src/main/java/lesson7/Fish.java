package lesson7;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);

    }

    @Override
    public String toString(){
        return String.format("Hello, I'm %s",this.name);
    }
}
