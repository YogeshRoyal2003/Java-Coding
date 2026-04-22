package Practice10thApril;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Students that){
        if(this.age > that.age){
            return 1;
        }
        else return -1;
    }
}

public class comparator3 {
    public static void main(String[] args) {
        ArrayList<Students> studs = new ArrayList<>();
        studs.add(new Students(18, "Yogesh"));
        studs.add(new Students(32, "Roy"));
        studs.add(new Students(12, "Yogi"));

        Collections.sort(studs);
        
        for(Students s: studs){
            System.out.println(s);
        }
    }
}
