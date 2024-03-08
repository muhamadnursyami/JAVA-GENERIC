package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {

    public static void main(String[] args) {
//        Mydata bertipe data String Object atau Integer Object
        MyData<String> stringMyData = new MyData<String>("Eko");
        MyData<Integer> integerMydata = new MyData<Integer>(10);

//        Untuk mendapatkan datanya
        String stringValue = stringMyData.getData();
        Integer integerValue = integerMydata.getData();
        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
