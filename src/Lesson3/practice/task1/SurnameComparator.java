package src.Lesson3.practice.task1;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Personal> {

    @Override
    public int compare(Personal o1, Personal o2) {
        return o2.getSurname().compareTo(o1.getSurname());
    }
}
