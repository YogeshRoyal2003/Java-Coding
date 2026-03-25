package Practice;

class A{
    A(){
        System.out.println("In A's Constructor");
    }

    public void show(){
        System.out.println("In A's show method");
    }

    public void show0(){
        System.out.println("In A's 0 show method");
    }
}

class B extends A{

    public void show(){
        System.out.println("In B's show method");
    }

    final void show1(){
        System.out.println("In B's final method");
    }


    B(){
        super();
        System.out.println("In B's default constructor");
    }

    B(int a){
        this();
        System.out.println("In B's parameterized constructor");
    }

    public void hello(){
        System.out.println("Hello!");
    }


}

final class C extends B{
    public void show(){
        System.out.println("In C's show method");
    }

    // final void show1(){

    // }
}

// class D extends C{

// }

public class Constructor {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();

        B obj1 = new B(2);
        obj1.hello();

        // final int n = 10;
        // n = 20;

        int num = 10;
        // Integer obj2 = new Integer(num);
        Integer obj2 = num;
        System.out.println(obj2);

        Integer obj3 = 20;
        int num1 = obj3;
        System.out.println(num1);

        A obj4 = new B();
        obj4.show0();

        B obj5 = (B) obj4;
        obj5.show();

    }
    
}
