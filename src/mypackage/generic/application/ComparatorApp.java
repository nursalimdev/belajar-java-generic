package mypackage.generic.application;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nursalim", "Jakarta"),
                new Person("Nani", "Bandung"),
                new Person("Naura", "Jakarta"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                 return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(persons, comparator);
        System.out.println(Arrays.toString(persons));
    }
}
