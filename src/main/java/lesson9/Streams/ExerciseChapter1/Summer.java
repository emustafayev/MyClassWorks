package lesson9.Streams.ExerciseChapter1;

@FunctionalInterface
public interface Summer<E> {
    E SumOfArgs(E arg1, E arg2);

    static void print(){
        System.out.println("Helllloooo!");
    }
}
