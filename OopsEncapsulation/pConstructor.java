package OopsEncapsulation;

class EmployeeDetails{
    private String Ename;
    private String Gmail;

    public EmployeeDetails(String name, String mail){
        System.err.println("Inside Parameterised constructor");
        Ename = name;
        Gmail = mail;
    }

    public String getEname(){
        return Ename;
    }

    public void setEname(String name){
        Ename = name;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    
}

public class pConstructor {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("Yogesh Royal", "yogi@gmail.com");
        System.out.println("Name of EMployee: " + emp.getEname());
        System.out.println("Employee mail id: " + emp.getGmail());
    }
}
