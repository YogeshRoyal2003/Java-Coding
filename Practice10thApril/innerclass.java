package Practice10thApril;

class Outer{
    public void outer(){
        System.out.println("Outer class");
    }

    static class Inner{
        public void inner(){
            System.out.println("Inner class");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outer();
        // obj.inner();

        // Outer.Inner ob = obj.new Inner();
        // ob.inner();
        
        Outer.Inner ob = new Outer.Inner();
        ob.inner();
    
    }
}
