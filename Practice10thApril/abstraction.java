package Practice10thApril;

abstract class L{
    public abstract void display();
    public void show(){
        System.out.println("hello!!");
    }
}

// class M extends L{
//     public void display(){
//         System.out.println("in display method from class L in class M");
//     }
// }

public class abstraction {
    public static void main(String[] args) {
        // M obj = new M();
        // obj.display();
        // obj.show();

        L obj = new L(){
            public void display(){
                System.out.println("Display method implemented using anonymous class");
            }
        };
        obj.display();
        obj.show();


    }
}
