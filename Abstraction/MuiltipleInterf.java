package Abstraction;

interface X{
    void show();
}

interface Y{
    void show1();
}

interface Z extends Y{
    // void show2();
}

class Multi implements X,Z{
    public void show(){
        System.out.println("In X interface show");
    }
    public void show1(){
        System.out.println("in Y interface show");
    }
}
public class MuiltipleInterf {
    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.show();
        obj.show1();
    }
}
