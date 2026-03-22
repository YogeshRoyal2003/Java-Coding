package Polymorphism;
// Polymorphism is the ability of an object to take on many forms. 
// It allows us to perform a single action in different ways. 
// In Java, there are two types of polymorphism: 
// compile-time polymorphism (method overloading) and 
// runtime polymorphism (method overriding).

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

public class Poly {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
}
