package Methods;

class UserDetails{
    public void name(){
        System.out.println("Yogesh Royal Thupakula");
    }
    public int age(int year){
        return 2026 - year;
    }
    public static String sex(){
        return "male";
    }
}

public class method {
    public static void main(String[] args) {
        int birthYear = 2003;

        UserDetails user = new UserDetails();
        user.name();

        int pAge = user.age(birthYear);
        System.out.println(pAge);

        String str = UserDetails.sex();
        System.out.println(str);
    }
}
