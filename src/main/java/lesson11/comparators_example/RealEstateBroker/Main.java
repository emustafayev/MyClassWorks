package lesson11.comparators_example.RealEstateBroker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Home> homes = Arrays.asList(
                new Home( "Forest Acres" , 425000.0, 4, 1.7, 5.1, 4.5),
                new Home( "Happy Gardens", 510000.0, 4, 2.3, 5.1, 4.5),
                new Home( "Comfy Condos" , 190000.0, 2, 0.9, 2.1, 4.5),
                new Home( "Comfy Condos" , 190000.0, 2, 0.9, 0.7, 4.5),
                new Home( "Happy Gardens", 470000.0, 4, 2.1, 5.1, 4.5),
                new Home( "Forest Acres" , 345000.0, 3, 1.5, 3.2, 5.9),
                new Home( "Happy Gardens", 375000.0, 3, 1.5, 2.3, 2.4),
                new Home( "Comfy Condos" , 190000.0, 2, 0.3, 0.5, 2.4)
        );
//        double d1 = 5.67;
//        double d2 = 5.63;
//        int d = (int)(d2-d1);
//        System.out.println(d);

        Comparator<Home> byRooms = (o1, o2) -> o2.numBedrooms-o1.numBedrooms;
        Comparator<Home> byPrice = (o1, o2)->(int)(o1.price-o2.price);
        Comparator<Home> byProperty = Comparator.comparing(x -> x.acres, (x, y) -> (int)(Math.ceil(y) - Math.ceil(x)));
        Comparator<Home> bySchool =
                Comparator.comparing( x -> x.schoolDistance,
                        (x,y) -> (int)(Math.ceil(x) -
                                Math.ceil(y)));
        Comparator<Home> byTrain =
                Comparator.comparing( x -> x.trainDistance,
                        (x,y) -> (int)(Math.ceil(x) -
                                Math.ceil(y)));
        Collections.sort(homes,byPrice);
        homes.forEach(System.out::println);
        System.out.println("-----------------------");
        homes.forEach(System.out::println);



    }
}
