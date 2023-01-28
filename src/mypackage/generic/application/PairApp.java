package mypackage.generic.application;

import mypackage.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Nursalim", 1000);
        Pair<Boolean, Integer> pair2 = new Pair<>(true, 1000);

        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
    }
}
