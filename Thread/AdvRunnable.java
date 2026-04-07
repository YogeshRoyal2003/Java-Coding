package Thread;

public class AdvRunnable {

    public static void main(String[] args) {
        Runnable obj = () -> {
            for(int i=0; i<=10; i++){
                System.out.println("hello: " + i);
            }
        };
        Thread t1 = new Thread(obj);
        t1.start();
    }
}

// public class AdvRunnable {
//     public static void main(String[] args) {
//         Runnable obj = new Runnable() {
//             public void run(){
//                 for(int i=0; i<=10; i++){
//                     System.out.println("hi: " + i);
//                 }
//             }
//         };

//         Thread t1 = new Thread(obj);
//         t1.start();
//     }
// }
