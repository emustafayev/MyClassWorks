package lesson9.Streams.PlayfulPets;

import java.util.ArrayList;
import java.util.List;

public class PetsApp {

    public static void main(String[] args) {
        Pet.pets.add(new Pet("Scruffy","dog","poodle",
                "white",895.00));
        Pet.pets.add(new Pet("Meow","cat","siamese","white",740.25));
        Pet.pets.add(new Pet("Max","dog","poodle","black",540.50));
        Pet.pets.add(new Pet("Cuddles","dog","pug","black",1282.75));
        Pet.pets.add(new Pet("Slider","snake","garden",
                "green",320.00));

        PetMatcher breedMatcher = pet -> {
            List<Pet> matched =new ArrayList<>();
            for(Pet p:Pet.pets){
                if(p.equals(pet)){
                    matched.add(p);
                }
            }return matched;
        };

        PetMatcher priceMatch = pet->{
            List<Pet> matches = new ArrayList<>();
            for(Pet p:Pet.pets){
                if(p.price<2300){
                    matches.add(p);
                }
            }return matches;
        };
        matcher("poodle",breedMatcher);
        matcher(null,priceMatch);
    }

    public static void matcher(String breed, PetMatcher matcherWay){
        Pet pet = new Pet(null,null,breed,null,0.0);

        System.out.println("Result: ");
        for(Pet p:matcherWay.match(pet)){
            System.out.println(p);
        }
    }
}

