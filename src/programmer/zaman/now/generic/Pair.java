package programmer.zaman.now.generic;

//Membuat generic multiple paramater
public class Pair <T,U>{

    private  T first;
    private U second;

//    Constructor
    public  Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

//    Membuat Getter dan Setter
    public T getFirst(){
        return  first;
    }

    public void setFirst(){
        this.first = first;
    }

    public U getSecond(){
        return  second;
    }

    public void setSecond(){
        this.second = second;
    }

}
