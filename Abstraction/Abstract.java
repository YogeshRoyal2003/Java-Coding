package Abstraction;

abstract class User{
    public void name(){
        System.out.println("Yogesh");
    }

    public void age(){
        System.out.println(23);
    }

    abstract public void mNumber();
    abstract public void eContact();
}

abstract class Contact extends User{
    public void mNumber(){
        System.out.println(123456);
    }

    public void address(){
        System.out.println("Bengaluru");
    }

    abstract public void eContact();
}

class Emergency extends Contact{
    public void eContact(){
        System.out.println(12121);
    }
}

public class Abstract {
    public static void main(String[] args) {
        User u1 = new Emergency();
        u1.name();
        u1.mNumber();
        u1.eContact();
        u1.age();
    }
}
