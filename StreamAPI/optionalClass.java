package StreamAPI;

import java.util.Arrays;
import java.util.List;
// import java.util.Optional;

public class optionalClass {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Yogesh", "Laxmi" , "Royal", "yogi");

        // Optional<String> name = list.stream()
        //                             .filter(str -> str.contains("x"))
        //                             .findFirst();

        // System.out.println(name.orElse("Not Found"));

        String name = list.stream()
                          .filter(str -> str.contains("x"))
                          .findFirst()
                          .orElse("Not FOUND");
                    
        System.out.println(name);
    }
}
