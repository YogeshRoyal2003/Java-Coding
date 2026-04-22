package Practice10thApril;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator1 {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() < s2.length()){
                    return 1;
                }
                else return-1;
            }
        };

        ArrayList<String> list = new ArrayList<>();
        list.add("yogesh");
        list.add("royalroyal");
        list.add("thupakula");

        Collections.sort(list, comp);

        System.out.println(list);



    }
}
