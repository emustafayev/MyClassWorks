package lesson11.Iterations;

import java.util.Iterator;

public class Hidden implements Iterable<String>{
    private final String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int count=months.length-1;
            @Override
            public boolean hasNext() {
                return count>=0;
            }

            @Override
            public String next() {
                String month = months[count];
                count--;
                return month;
            }
        };
    }
}
