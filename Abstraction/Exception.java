package Abstraction;

public class Exception {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        try{
            j = 20/i;
            System.out.println(j);
            if(j == 0){
                throw new ArithmeticException("Can't divide by zero");
            }
            else{
                System.out.println("Successful division");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("Caught an exception and setting a default value: " + j);
        }
        finally{
            System.out.println("End of the program even after exception occured/not occured");
        }
    }
}
