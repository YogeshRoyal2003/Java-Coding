package Polymorphism;

public class Wrapper {
    public static void main(String[] args) {
        int num = 2;
        // Integer obj = new Integer(num); //Manual Wrapper conversion
        Integer obj = num; //Auto-Boxing
        System.out.println(obj);

        Integer obj1 = 3;
        int num1 = obj1; //Un-Boxing "reverse of autoboxing"
        System.out.println(num1);
    }
}
