package Thread;

class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hi :" + i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hello: " + i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Runnables {
    public static void main(String[] args) {
        Runnable obj1 = new MyRunnable();
        Runnable obj2 = new MyRunnable1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
