package programmer.zaman.now.generic.util;

public class ArrayHelper {
//    tidak wajib static ini hanya contohnya saja
//    Jika ingin menambahkan generic tinggal tambah , aja
//    contoh : <T,J>
    public  static  <T> int count(T[] array){
        return array.length;
    }
}
