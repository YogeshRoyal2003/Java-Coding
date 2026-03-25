package Practice;

class Calc{


    public void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Overloading with 1 extra: " + (a+b+c));
    }
    public int sub(int a, int b){
        return a-b;
    }
    public static void mul(int a, int b){
        System.out.println("Multiplication that doesn't depends on object");
        System.out.println("Res:" + (a*b));
    }

    public void hello(){
        System.out.println("Hello from Parent class");
    }

}

class AdvClac extends Calc{
    public void div(int a, int b){
        System.out.println("Division: " + (a/b));
    }

    public void hello(){
        System.out.println("Overriding Parent class data of hello() and printing this from child class");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        AdvClac obj = new AdvClac();
        obj.add(3, 4);
        obj.add(1, 2, 3);
        System.out.println("Subtraction: " + obj.sub(3, 2));
        obj.div(5, 2);
        obj.hello();

        Calc.mul(3, 5);
    }
}
