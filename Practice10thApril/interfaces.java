package Practice10thApril;

interface A{
    void display();
    void show();
    void call();
}

class Ex implements A{
    public void display(){
        System.out.println("Display");
    }
    public void show(){
        System.out.println("Show");
    }
    public void call(){
        System.out.println("Call");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Ex obj = new Ex();
        obj.display();
        obj.show();
        obj.call();
    }
}
