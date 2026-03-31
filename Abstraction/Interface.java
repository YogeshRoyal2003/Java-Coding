package Abstraction;

interface Student{

    String city = "Bengaluru";

    void name();
    void age();
}

class SContact implements Student{
    public void name(){
        System.out.println("Yogesh");
    }

    public void age(){
        System.out.println(23);
    }

    public void mobile(){
        System.out.println(12345);
    }
}

// class EContact implements Student{

// }

public class Interface {
    public static void main(String[] args) {
        Student s1 = new SContact();
        s1.name();
        s1.age();
        // s1.mobile();

        SContact s2 = new SContact();
        s2.mobile();

        System.out.println(Student.city); 
    }
}
