package mypackage.generic.application;

import mypackage.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>("Nursalim"));
        print(new MyData<>(100));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData <?> myData){
        System.out.println(myData.getData());
    }
}
