package mypackage.generic.application;

import mypackage.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("Nursalim");
        MyData<Integer> myDataInteger = new MyData<>(100);
        var myDataBoolean = new MyData<>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());
    }
}
