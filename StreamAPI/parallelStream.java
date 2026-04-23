package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelStream {
    public static void main(String[] args) {
        
        int size = 10000;
        List<Integer> list = new ArrayList<>(size);

        Random ran = new Random();
        for(int i=1; i<=size; i++){
            list.add(ran.nextInt(100));
        }

        int sum = list.stream()
                      .map(n -> n* 2)
                      .reduce(0, (c,e) -> c+e);

        long startSeq = System.currentTimeMillis();
        int sum1 = list.stream()
                    //    .map(n -> n *2)
                        .map(n -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                        return n*2;
                      })
                       .mapToInt(n -> n)
                       .sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int sum2 = list.parallelStream()
                    //    .map(n -> n *2)
                       .map(n -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                        return n*2;
                      })
                       .mapToInt(n -> n)
                       .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum + " " + sum1 + " " + sum2);
        System.out.println("seq: " + (endSeq - startSeq));
        System.out.println("para: " + (endPara - startPara));
    }
    
}
