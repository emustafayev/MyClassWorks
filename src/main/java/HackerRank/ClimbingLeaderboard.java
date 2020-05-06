package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        climbingLeaderboard(new int[]{})
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice){
        int[] rank = {0};

        int[] result = new int[alice.length];

            Arrays.stream(scores).boxed()
                .collect(Collectors.toSet())
                .stream()
                .sorted((a,b)->b-a)
                .flatMapToInt(s->
                        Arrays.stream(alice).map(as->{
                    if (s>=as) {
                        result[rank[0]] = rank[0];

                    }
                    return result[rank[0]++];
        }));
            return result;

    }
}
