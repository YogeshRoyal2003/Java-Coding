package Abstraction;

class YogiException extends RuntimeException {
    public YogiException(String message){
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            System.out.println(j);
            if(j == 0){
                throw new YogiException("Can't divide by zero");
            }
            else{
                System.out.println("Successful division");
            }
        }
        catch(YogiException e){
            j = 18/1;
            System.out.println("Caught an exception and setting a default value: " + j);
        }
}
}
