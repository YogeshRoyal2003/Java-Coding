package Inheritance;

class Q{
    public Q(){
        System.out.println("In Q's constructor");
    }
}

class W extends Q{
    public W(){
        super(); //super exits even without mentioning, it calls constructor of the super(parent) class
        System.out.println("In W's constructor");
    }

    public W(int a){
        this(); //this() calls contructor of present class
        //only this or only super can be used not both and super exists without even mentioning
        System.out.println("In W's Para constructor");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        W obj = new W(2);
    }
    
}
