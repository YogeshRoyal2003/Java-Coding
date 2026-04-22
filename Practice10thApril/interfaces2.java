package Practice10thApril;

@FunctionalInterface
interface AB {
    void show();
    // void show3();
    default void show1(){
        System.out.println("Hello from show1 in interface using normal method initialization");
    }

    static void show2(){
        System.out.println(":hello from show2 using static method type");
    }
}

interface BC{
    void show3(int i);
}

interface CD{
    int add(int i, int j);
}

// class BC implements AB{
//     public void show(){
//         System.out.println("Show method implemented using class");
//     }
//     public void show3(){
//         System.out.println("Hello ");
//     }
// }

public class interfaces2 {
    public static void main(String[] args) {
        // BC obj = new BC();
        // obj.show();
        // obj.show1();
        // // obj.show2();
        // AB.show2();

        // AB obj = new AB() {
        //     public void show(){
        //         System.out.println("Implemented show method of functional interface using anonymous class");
        //     }
        // };
        // obj.show();
        // obj.show1();
        // AB.show2();

        AB obj = () -> 
                System.out.println("Implemented using Lambda Expressions");
        obj.show();
        obj.show1();
        AB.show2();

        BC obj1 = i -> System.out.println("In show3: " + i);
        obj1.show3(100);

        CD obj3 = (i,j) -> i+j;
        int res = obj3.add(2, 3);
        System.out.println(res);
        System.out.println(obj3.add(100, 100));
    }
}
