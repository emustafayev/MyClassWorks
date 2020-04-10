package lesson4;

import java.util.ArrayList;

public class ClassOp {
    public static void main(String[] args) {



        Pizza p1 = new Pizza("NameOFPizza",45.67F,"Middle");
        Pizza p2 = new Pizza("Name2",34.65F,"Big");

        ArrayList<Pizza> pizza = new ArrayList<Pizza>();
        pizza.add(p1);
        pizza.add(p2);


        p1.getString();
        p2.getString();
        System.out.println(Pizza.count);

    }
}
