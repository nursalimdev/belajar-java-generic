package mypackage.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumber = new NumberData<>(100);
        NumberData<Long> longNumber = new NumberData<>(100L);
//        NumberData<String> stringNumber = new NumberData<String>("100"); //error

    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
