package Thread;

class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hi: " + i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hello: " + i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // System.out.println(t1.getPriority() + " , " + t2.getPriority());
        // t1.setPriority(10);
        // t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
