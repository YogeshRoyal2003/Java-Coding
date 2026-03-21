package Inheritance;

class A{
    public void show(){
        System.out.println("In A's show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B's show");
    }
}



public class MethodOverride {
    public static void main(String[] args) {
        // A obj = new A();
        B obj1 = new B();
        // obj.show();
        obj1.show();
    }
}
