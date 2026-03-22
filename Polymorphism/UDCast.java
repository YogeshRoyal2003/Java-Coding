package Polymorphism;

class P{
    public void show1(){
        System.out.println("In P's show1");
    }
}

class Q extends P{
    public void show2(){
        System.out.println("In Q's show2");
    }
}

public class UDCast {
    public static void main(String[] args) {
        P obj = new Q(); // Up-casting
        obj.show1();

        Q obj1 = (Q) obj;
        obj1.show2();
        obj1.show1();

    }
}
