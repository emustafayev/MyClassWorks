package lesson10.v3;

import java.util.List;

public class ListOfRes {
    public final List<Character> unique;
    public final List<Integer> counts;

    public ListOfRes(List<Character> unique, List<Integer> counts) {
        this.unique = unique;
        this.counts = counts;
    }
}
