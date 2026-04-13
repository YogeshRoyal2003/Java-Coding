package Practice10thApril;

class Stu{
    int rollno;
    String name;
}

public class ArrayObj {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.rollno = 1;
        s1.name = "Yogesh";

        Stu s2 = new Stu();
        s2.rollno = 2;
        s2.name = "Royal";

        Stu s3 = new Stu();
        s3.rollno = 3;
        s3.name = "Yogi";

        Stu students[] = new Stu[3];
        students[0] = s1;
        students[1]= s2;
        students[2] = s3;
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].rollno + " : " + students[i].name);
        }

    }
}
 