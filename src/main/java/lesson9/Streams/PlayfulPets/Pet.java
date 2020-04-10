package lesson9.Streams.PlayfulPets;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    String name;
    String animal;
    String breed;
    String color;
    Double price;
    static List<Pet> pets = new ArrayList<>();

    public Pet(String n, String a, String b, String c, double p) {
        name = n;
        animal = a;
        breed = b;
        color = c;
        price = p;
    }

    @Override
    public String toString(){
        return "Name: "+name;
    }
    @Override
    public boolean equals(Object o){
        Pet p = (Pet)o;
        return breed.equals(p.breed);
    }
}
