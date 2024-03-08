package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMydata = new MyData<>("Eko");
//        diIt(stringMyData) // ERROR
//        MyData<Object> objectMyData = stringMyData //ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; //ERROR
//        doInteger(objectMyData);
    }

    public  static  void doIt(MyData<Object> objectMyData){
//        do nothing
    }

    public static void doInteger(MyData<Integer> integerMyData){
//        do nothing
    }
}
