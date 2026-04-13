package Practice10thApril;

class X{
    public X(){
        // super();
        this(1);
        System.out.println("in X");
    }

    public X(int a){
        super();
        System.out.println("in X int");
    }

    public void disp(){
        System.out.println("Hello");
    }


}

class Y extends X{
    public Y(){
        super();
        // this(1);
        System.out.println("in Y");
    }
    public Y(int a){
        // super();
        this();
        System.out.println("in Y int");
    }
}

public class superthis {
    public static void main(String[] args) {
        Y obj = new Y(1);
        obj.disp();
    }
}
