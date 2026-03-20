package OopsEncapsulation;

class EmployeeDetails{
    private String Ename;
    private int age;

    public EmployeeDetails(){
        System.out.println("Inside Default COnstructor");
        Ename = "Yogesh";
        age = 23;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

public class constructor {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        System.out.println(emp.getEname() + " : " + emp.getAge());
    }
}
