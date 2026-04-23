package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class methodRef {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Yogesh", "Royal", "thupakula");

        List<String> uNames = list.stream()
                            // .map(name -> name.toUpperCase())
                            .map(String :: toUpperCase)
                            .toList();

        // System.out.println(uNames);
        // uNames.forEach(str -> System.out.println(str));
        uNames.forEach(System.out :: println);

    }
}
