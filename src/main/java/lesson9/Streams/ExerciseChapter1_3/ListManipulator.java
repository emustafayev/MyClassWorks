package lesson9.Streams.ExerciseChapter1_3;

import java.util.ArrayList;
import java.util.List;

public interface ListManipulator<T> {
    void manipulate(List<T> list, T t);

    default List<T> create(){
        return new ArrayList<>();
    }

}
