package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Eko"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

//    <?> ini adalah tanda wild card , dimana ini akan menerima semua generic
//    tanpa peduli tipe datanya, mau itu Integer atau String
//    Jadi hati hati dan tidak direkomendasikan untuk menkonversi sesuatu pada method ini
    public  static  void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
