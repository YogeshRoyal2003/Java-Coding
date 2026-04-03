package Abstraction;

// import java.util.Scanner;

@FunctionalInterface
interface Employ{
    void name(int empid, int age);
}

@FunctionalInterface
interface calc{
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        Employ e1 = (empid, age) -> System.out.println("Thupakula Yogesh Royal" + " - " + " Employee id: " + empid + " , " + " Age: " + age);
        e1.name(1000, 23);

        calc add1 = (a, b) -> a + b;
        System.out.println("Addition: " + add1.add(2, 3)); 

        // System.out.println("Enter a num: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Your number is: " + num);
        // sc.close();
    }
}
