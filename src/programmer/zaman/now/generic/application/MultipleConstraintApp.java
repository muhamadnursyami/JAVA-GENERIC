package programmer.zaman.now.generic.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
//    Data<Manager> managerData=  new Data<>(new Manager()); Error Manager tidak implement CanSayHello Interface
    Data<VicePresident> vicePresidentData= new Data<>(new VicePresident());
    }
    public  static interface CanSayHello{
        void SayHello(String name);
    }

    public static  abstract  class Employee{

    }
    public static  class Manager extends  Employee{

    }

    public  static  class VicePresident extends Employee implements CanSayHello{

        @Override
        public void SayHello(String name) {
            System.out.println("hello" + name);
        }
    }

//    dalam paramater generic ini hanya bisa 1 class yaitu Employee dan sisanya hanya
//    bisa menggunakan inteface dan untuk menambahkanya tinggal tambahakan & untuk menambahkan intefaces
//    sampai 2 atau 3 seterusnya
    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public  Data(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

        }
    }
}
