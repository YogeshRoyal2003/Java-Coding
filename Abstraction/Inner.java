package Abstraction;

class A{
    public void display(){
        System.out.println("in class A display method");
    }

    class B{
        public void display1(){
            System.out.println("in class B display method");
        }
    }

    static class C{
        public void display2(){
            System.out.println("in class C static display method");
        }
    }
}

class D{
    public void show(){
        System.out.println("in class D show method");
    }
}

public class Inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();

        A.B obj1 = obj.new B();
        obj1.display1();

        A.C obj3 = new A.C();
        obj3.display2();

        D obj4 = new D(){
            public void show(){
                System.out.println("in anonymous class, show1() method");
            }
        };
        obj4.show();
    }
}
