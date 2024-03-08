package programmer.zaman.now.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer>  integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

//        NumberData<String> stringNumberData = new NumberData<String>("Eko"); ERROR

    }

//    Membuat sebuah class  generic yang memiliki turunan Number
//    Jadi hanya turunan number yang bisa pakai, selain dari itu, String tidak bisa
    public  static class NumberData<T extends Number>{
        private  T data;

//        Contructor

    public NumberData(T data) {
        this.data = data;
    }

//    Getter dan Setter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
}
