package lesson11.comparators_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Students> std_list = Arrays.asList(
        new Students(66.5,100,"Name1"),
        new Students(63.4,101,"Ame2"),
        new Students(98.34,102,"Came3"),
        new Students(87.54,105,"Dame4"),
        new Students(87.56,107,"Tame5"),
        new Students(50.34,109,"Name6"),
        new Students(70.54,112,"Wame7"),
        new Students(88.12,106,"Xame1"),
        new Students(90.32,109,"Oame1")
        );


        Comparator<Integer> cmp = (x,y)->x-y;
        System.out.println(cmp.compare(3,6));


        Comparator<Students> c1 = (o1, o2)-> (int)(o1.GPA-o2.GPA);
        Comparator<Students> c2 = (o1, o2) -> o2.id - o1.id;
        Comparator<Students> c3 = Comparator.comparing(o -> o.name);
        Consumer<Students> print = students -> System.out.printf("GPA: %.2f, id: %d, name:%s\n",students.GPA,students.id, students.name);
        Collections.sort(std_list,c1);
        std_list.forEach(print);
        Collections.sort(std_list,c2);
        System.out.println("----------");
        std_list.forEach(print);
        System.out.println("----------");
        Collections.sort(std_list,c3);
        std_list.forEach(print);

    }

}
