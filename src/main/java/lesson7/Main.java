package lesson7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("MyCat");
        Animal dragon = new Animal("Dragonnnnn"){
            @Override
            public String toString() {
                return "Hell Im dragon My name is " + name;
            }
        };
        Fish fish = new Fish("Fishyy");



        ArrayList<Animal> list = new ArrayList<>();
        list.add(cat);
        list.add(fish);
        list.add(dragon);


        for (Animal animal:list){
            System.out.println(animal.toString());
        }
    }
}
