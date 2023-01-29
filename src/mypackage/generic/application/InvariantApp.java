package mypackage.generic.application;

import mypackage.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Nursalim");
//        doIt(stringMyData); error karena invariant
//        MyData<Object> objectMyData = stringMyData; // error

    }

    public static void doIt(MyData<Object> objectMyData){
        //
    }
}
