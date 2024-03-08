package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        //Contravariant itu tidak aman, tetapi write atau edit nya itu aman
//  maksudnya dari MyData <Object> ke MyData <String>
//        Obejct adalah parent dan String adalah child
//        Contravariannt  itu adalah dari parent ke child
//        Dari Object ke String , perhatikan dgn sekma code dibawah
//        Dia menginisalisasi   MyData<Object> dulu
//        Kemudian baru di contravariant seperti ini MyData<?super String>
        MyData<Object> objectMyData = new MyData<>("Eko");

        MyData<?super String> myData = objectMyData;

//        Kita panggil method contravariant
         process(objectMyData);

//         Kemudian kita ambil datanya, posisi nya itu kita berada di main method
//        yang tidak menggunakan Contravariant
        System.out.println(objectMyData.getData());
    }

//    menthod yang menggunakan Contravariant
    public static void process(MyData<? super  String> myData){

//        Namun Jika kita mengambil data nya didalam method yang menggunakan COntravariant maka akan
//        error dan harus di paksa di konversi menggunakan (String)
//        Ini tidak di rekomendasikan karena dan sebenarnya object itu bisa menerima string dan integer
//        namun karena kita terpaksa konversi menjadi string , maka jika kita mengirim kan
//        paramater nya itu number , pada code ini diatas new MyData<>("Eko");
//        maka akan error
        String value = (String) myData.getData();
        System.out.println("Procces Parameter" + value);
//        Pada method yang didalamnya itu contravariant itu kita bisa write atau mengset datanya
        myData.setData("Eko Kurniawan");
    }
}
