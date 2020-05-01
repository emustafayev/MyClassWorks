package lesson28snake.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parking {

  public static void main(String[] args) {
    List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);//2 6 7 12
    long r = carParkingRoof(cars, 3);
    System.out.println(r); // 6
  }

  private static long carParkingRoof(List<Long> cars, int k) {
    Collections.sort(cars);
    return IntStream.range(0,cars.size()-k).boxed()
            .mapToLong(i->cars.get(i+k-1)-cars.get(i)+1)
            .min()
            .orElseThrow(IllegalArgumentException::new);
  }

}
