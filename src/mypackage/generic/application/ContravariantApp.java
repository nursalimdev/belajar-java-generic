package mypackage.generic.application;

import mypackage.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Nursalim");
        MyData<? super String> myData = objectMyData;

        process(myData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("process parameter " + value);
        myData.setData("Al Farizi");
    }
}
