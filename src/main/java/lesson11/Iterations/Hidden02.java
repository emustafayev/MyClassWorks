package lesson11.Iterations;

import java.util.*;

public class Hidden02 implements Iterable<String> {
    private final String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    @Override
    public Iterator<String> iterator() {
        Random rand = new Random();

        return new Iterator<String>() {
            HashSet<String> unique_hs = new HashSet<>();
            List<String> list = new ArrayList<>();
            int count=0;
            @Override
            public boolean hasNext() {
                return list.size() <= 12;
            }

            @Override
            public String next() {
                int r =rand.nextInt(months.length);
                if(!list.contains(months[r])){
                   list.add(months[r]);
                }
                return months[r];
            }
        };
    }
}
