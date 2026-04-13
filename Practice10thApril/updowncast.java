package Practice10thApril;
class Q{
    public void show(){
        System.out.println("Hello from Q class show1");
    }
}

class W extends Q{
    public void show2(){
        System.out.println("Hello from W class show2");
    }
}

public class updowncast {
    public static void main(String[] args) {
        Q obj = new W();
        obj.show();
        // obj.show2();

        W obj1 = (W) obj;
        obj1.show();
        obj1.show2();


        System.out.println();
        System.out.println("Normal obj creation of extended class");
        W ob = new W();
        ob.show();
        ob.show2();

        System.out.println();
        System.out.println("Wrapper class - AutoBoxing");
        int n = 10;
        // Integer num = new Integer(n);
        Integer num = n;
        System.out.println(num);

        System.out.println();
        System.out.println("Wrapper class - Unboxing");
        Integer n1 = 10;
        int n2 = n1;
        System.out.println(n2);
    }
}
