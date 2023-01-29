package mypackage.generic.application;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nursalim", "Jakarta"),
                new Person("Nani", "Bandung"),
                new Person("Naura", "Jakarta"),
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
