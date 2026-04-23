package StreamAPI;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
// import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(4,5,2,6,7,2);

        // Stream<Integer> s1 = list.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n *2);
        // int res1 = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(res1);

        int res = list.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);
        System.out.println(res);


        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        // int sum = 0;
        // for(int n : list){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum = sum+n;
        //     }
        // }
        // System.out.println(sum);

        
        //WORKING OF forEach() METHOD:
        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     };
        // };
        // Consumer<Integer> con = n -> System.out.println(n);
        // list.forEach(con);

        // list.forEach(n -> System.out.println(n));

        


        
    }
}
