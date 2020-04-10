package lesson9.Streams.ExerciseChapter1_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManipulator<String > sListAdd = List::add;
        ListManipulator<Integer> iListAdd = List::add;
        ListManipulator<Integer> iListRemove = List::remove;

        List<String> strings = sListAdd.create();
        sListAdd.manipulate(strings,"Afgan");
        List<Integer> integers = iListAdd.create();
        iListAdd.manipulate(integers,23);
        iListAdd.manipulate(integers,25);
        iListRemove.manipulate(integers,23);

    }
}
