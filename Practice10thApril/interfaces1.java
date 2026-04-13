package Practice10thApril;
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: faster!!");
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class interfaces1 {
    public static void main(String[] args) {
        Computer obj1 = new Laptop();
        // Computer obj2 = new Desktop();

        Developer dev = new Developer();
        dev.devApp(obj1);
        
    }
    
}
