package Practice10thApril;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
}

public class comparator2 {
    public static void main(String[] args) {

        // Comparator<Student> comp = new Comparator<Student>() {
        //     public int compare(Student i, Student j){
        //         if(i.age > j.age){
        //             return 1;
        //         }
        //         else return -1;
        //     }
        // };

        Comparator<Student> comp = (i, j) -> (i.age>j.age) ? 1 : -1;

        ArrayList<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "Yogesh"));
        studs.add(new Student(18, "Royal"));
        studs.add(new Student(12, "Yogi"));
        studs.add(new Student(32, "Roy"));

        Collections.sort(studs, comp);

        // System.out.println(studs);
        for(Student s: studs){
            System.out.println(s);
        }


        
    }
}
