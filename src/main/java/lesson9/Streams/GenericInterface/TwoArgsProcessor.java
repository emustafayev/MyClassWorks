package lesson9.Streams.GenericInterface;

@FunctionalInterface
public interface TwoArgsProcessor<E> {
    E process(E arg1, E arg2);
}
