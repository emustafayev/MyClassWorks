package warmup.junitexample;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    List<Scoreable> scores = new ArrayList<>();
    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }
    public int arichmeticMean(){
        int sum = scores.stream().mapToInt(Scoreable::getScore).sum();
        return sum/scores.size();
    }

}
