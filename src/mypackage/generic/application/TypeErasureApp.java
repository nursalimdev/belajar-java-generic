package mypackage.generic.application;

import mypackage.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Nursalim");

        MyData<Integer> myDataInt = (MyData<Integer>) myData;

        Integer getData = myDataInt.getData();
    }
}
