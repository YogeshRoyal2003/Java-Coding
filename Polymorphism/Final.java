package Polymorphism;

// import Inheritance.calc;

class Q{
    final int num = 10;
    // num = 11; //this is not possible beacuse we can change the value of final variable
}

final class Calc{
    public void show(){
        System.out.println("This is a basic Calci");
    }
}

// class AdvCal extends Calc{

// } // this inheritance is not possible because we have declared our Calc class with final

class Calci{
    final void name(){
        System.out.println("Yogesh");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class Adv extends Calci{
    // public void name(){
    //     System.out.println("java");
    // } // this Method override is not possible because the name method in Calci is declared with final
}

public class Final {
    public static void main(String[] args) {
        Adv obj = new Adv();
        obj.name();
        obj.add(3, 4);
    }
}
