package Practice;

// import java.util.Arrays;
class UserDetails{

    static String companyName = "Capgemini";

    static void hello(){
        System.out.println("Hello from static method");
    }

    static{
        System.out.println("Name: " + companyName);
    }

    String n;
    int a;

    public UserDetails(){
        System.out.println("In Default Constructor: ");
        a = 0;
        n = "UNKNOWN!";
    }

    public UserDetails(String n, int a){
        System.out.println("In Parameterized constructor");
        this.n = n;
        this.a = a;
    }

    public void display(){
        System.out.println(n + " is of age " + a);
    }


    String name = "Yogesh";
    int age = 23;

    private long mobile = 12345678;
    
    public long getMobile(){
        return mobile;
    }

    public void setMobile(long mobile){
        this.mobile = mobile;
    }

    private String email;

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    
}

public class Main1 {
    public static void main(String[] args) {
        System.out.println(UserDetails.companyName);
        UserDetails.hello();

        UserDetails user1 = new UserDetails();
        
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.getMobile());
        
        user1.setEmail("yogesh@gamil.com");
        System.out.println(user1.getEmail());

        user1.display();

        UserDetails user2 = new UserDetails("Yogesh" , 23);
        user2.display();


    }
}
