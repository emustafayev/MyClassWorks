package lesson8_2;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Extra {
    public static int rand(){
        return (int)(Math.random()*10+1);
    }
    public static List<Figure> figures_rand_plain(){
        int N = rand();
        return IntStream.range(0,N).mapToObj(new IntFunction<Figure>() {
            @Override
            public Figure apply(int n){
                return Figure.rand();
            }
        }).collect(Collectors.toList());
    }

}
