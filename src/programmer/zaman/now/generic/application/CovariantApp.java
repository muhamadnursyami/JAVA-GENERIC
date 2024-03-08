package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {
//Covariant itu read nya aman, tetapi write atau edit nya itu berbahaya
//  maksudnya dari MyData <String> ke MyData <Object>
//        String adalah child dan Object adalah parent
//        Convarint itu adalah dari child ke parent
        MyData<String>  stringMyData = new MyData<>("Eko");
        process(stringMyData);
//        Penulisan Covarinat juga bisa seperti ini
        MyData<? extends  Object> myData = stringMyData;

    }
//    ini  yang namanya Covariant MyData<? extends Object>
//    dalam menggunakan Covariant kita hanya bisa mengambil data saja
//    tidak bisa mengset datanya , atau kita bisa mengambil getter pada method getData pada file MyData
//    tapi tidak bisa mengakases method setter setData pada file MyData
//    Covariant dalam parameter
//    Kita tidak bisa set data  didalam  Sebuah method yang menggunakan Covariant
//    contoh nya seperti di bawah ini
    public  static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
//    myData.setData(1); ini tidak boleh berbahaya pada datanya
    }
}
