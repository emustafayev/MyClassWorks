package lesson9.Streams;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetApp {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        int n=10;
        Random rand = new Random();

        ////////////////SOrt
        ArrayList<Integer> sortedList = IntStream.range(0, n)
                .mapToObj((int N) -> rand.nextInt(20) - 10)
                .map(x->x*3)
                .distinct().sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        str.append(sortedList);

        ////////////////////////////////////////////////////////////////////////////////
        ArrayList<String> list = new ArrayList<>();
        list.add("Name1");
        list.add("Name2");
        list.add("Name3");
        list.add("Name4");
        list.add("Name5");
        list.add("Name6");

        str.append("\n");

                for(int i=0;i<n;i++){
        str.append(list.get(rand.nextInt(list.size())));
        str.append(" ");
        }

        System.out.println(str);
        }
        }

