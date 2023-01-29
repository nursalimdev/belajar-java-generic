package mypackage.generic.application;

import java.util.Date;

public class MultipleConstraintApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<>(new Manager()); // error manager tidak implement CanSayHello
        Data<VicePresident> vpData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello{
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        public Data(T data) {
            this.data = data;
        }

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            this.data.sayHello("Hello ");
        }
    }
}
