package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Pair;

public class PairApp {
    public static void main(String[] args) {

//        T dan U di replace menjadi String dan Integer yang di konversi menurut di tipe datanya
        Pair<String, Integer> pair = new Pair<String, Integer>("EKO", 10);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
