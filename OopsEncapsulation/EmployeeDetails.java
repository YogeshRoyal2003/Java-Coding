package OopsEncapsulation;

public class EmployeeDetails {
    private String Ename;
    private String Gmail;

    public EmployeeDetails(String name, String mail){
        System.err.println("Inside Parameterised constructor");
        Ename = name;
        Gmail = mail;
    }

    // public EmployeeDetails(String name, String mail) {
    //     //TODO Auto-generated constructor stub
    // }

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
