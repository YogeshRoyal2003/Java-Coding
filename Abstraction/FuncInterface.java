package Abstraction;

@FunctionalInterface
interface Employee{
    void name();
    // void empid();
}

// class Emp implements Employee{
//     public void name(){
//         System.out.println("Yogesh");
//     }
    // public void empid(){
    //     System.out.println(12344);
    // }
// }

public class FuncInterface {
    public static void main(String[] args) {

        Employee e1 = new Employee() {
            public void name(){
                System.out.println("Yogesh Royal");
            }
        };
        e1.name();

        // Emp e1 = new Emp();
        // e1.name();
        // e1.empid();
    }
}
