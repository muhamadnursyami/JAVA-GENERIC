package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Muhamad", "Nur", "Syami"};
        Integer[] numbers = {1,2,3,4,5};

//        CARA MENGGUNAKAN METHOD GENERIC
        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
