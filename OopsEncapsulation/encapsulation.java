package OopsEncapsulation;

class UserDetails{
    String name = "Yogesh";
    private long number;
    private String gmail;

    public long getNumber(){
        return number;
    }

    public void setNumber(long number){
        this.number = number;
    }

    public String getGmail(){
        return gmail;
    }

    public void setGmail(String gmail){
        this.gmail = gmail;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setNumber(123456789);
        user.setGmail("user1@gmail.com");

        System.out.println(user.name + " : " + user.getGmail() + " : " + user.getNumber());
    }
}
