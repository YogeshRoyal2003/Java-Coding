package MethodOverloading;

class Calculator{

    private int age;
    
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class methodOverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double res = calc.add(2.6, 2);
        System.out.println(res);
    }
}
