package OopsEncapsulation;

class EmployeeDetails{

    //Static Method;
    public static void name(){
        System.out.println("Yogesh Royal Thupakula");
    }

    //Static Variables
    String name;
    int age;
    static String company;

    public void show(){
        System.out.println("Name: " + name + " Age: " + age + " Company Name: " + company);
    }

    //static block
    static{
        company = "Google";
        System.out.println("Inside static block");
    }
}

public class staticTypes {
    public static void main(String[] args) {
        EmployeeDetails.name();

        EmployeeDetails emp = new EmployeeDetails();
        EmployeeDetails emp1 = new EmployeeDetails();

        emp.name = "Yogesh";
        emp.age = 23;
        // EmployeeDetails.company = "Google";

        emp1.name = "suresh";
        emp1.age = 30;
        // EmployeeDetails.company = "Accenture";

        // EmployeeDetails.company = "Capgemini";

        emp.show();
        emp1.show();


    }
}
