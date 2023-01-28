package mypackage.generic.application;

import mypackage.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Nursalim", "Naura", "Nani"};
        Integer[] nilai = {100, 85, 65, 89, 50};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(nilai));
    }
}
