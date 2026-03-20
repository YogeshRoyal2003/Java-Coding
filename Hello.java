// public class Hello {

//     static double area(int base, int height){
//         return 0.5 * base * height;
//     }
//     public static void main(String args[]){
//         // System.out.println("HEllo World");
//         double res = area(20, 10);
//         System.out.println(res);
//     }
// }

class Calculator{
    public int add(int n1, int n2){
        int res = n1+n2;
        return res;
    }
}

public class Hello {

    public static void main(String args[]){
        int num1 = 5;
        int num2 = 10;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}