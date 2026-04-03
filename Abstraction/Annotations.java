package Abstraction;

class Q{
    public void show(){
        System.out.println("in Q show");
    }
}

class W extends Q{
    @Override
    public void show(){
        System.out.println("in w show after overriding");
    }
}

public class Annotations {
    public static void main(String[] args) {
        Q obj = new W();
        obj.show();
        // obj.show1();
    }
}
