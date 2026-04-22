package Practice10thApril;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else return-1;
            }
        };
        
        List<Integer> list = new ArrayList<>();
        list.add(27);
        list.add(34);
        list.add(41);
        list.add(68);

        Collections.sort(list, comp);

        System.out.println(list);

    }
}
