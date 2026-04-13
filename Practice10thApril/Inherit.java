package Practice10thApril;
class A{
    public void display(){
        System.out.println("Hello A's display method which is going to get called using B class");
    }
}

class A1 extends A{
    @Override
    public void display(){
        System.out.println("display method in class A got overrided by display method in class A1");
    }
}

// class B extends A{
//     public void hello(){
//         System.out.println("Hello from class B which is extending class A");
//     }
// }

// class C extends B{
//     public void helloc(){
//         System.out.println("hello from class C");
//     }
// }

public class Inherit {
    public static void main(String[] args) {

        A1 obj = new A1();
        obj.display();

        // A obj = new A();
        // obj.display();

        // System.out.println();
        // System.out.println("Calling A method using B class because B class extends A class");
        // B obj1 = new B();
        // obj1.hello();
        // obj1.display();

        // System.out.println();
        // System.out.println("calling A and B methods using class C");
        // C obj2 = new C();
        // obj2.hello();
        // obj2.display();
        // obj2.helloc();
    }
    
}
