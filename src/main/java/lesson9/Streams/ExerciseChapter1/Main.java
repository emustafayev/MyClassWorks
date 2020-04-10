package lesson9.Streams.ExerciseChapter1;

public class Main {
    public static void main(String[] args) {
        Summer<Integer> multibly = ((arg1, arg2) -> arg1*arg2);
        Summer<Double> doubleSum = ((arg1, arg2) -> arg1+arg2);

        System.out.println(multibly.SumOfArgs(4,5));
        System.out.println(doubleSum.SumOfArgs(3d,5d));
        Summer.print();
    }
}
