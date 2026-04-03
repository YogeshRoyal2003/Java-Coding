package Abstraction;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, complile, run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run....fasterrr");
    }
}

class Developer{
    public void devCode(Computer comp){
        comp.code();
    }
}

public class InterfNeed {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devCode(lap);
        dev.devCode(desk);
    }
}
