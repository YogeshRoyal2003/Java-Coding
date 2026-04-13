package Practice10thApril;

class Encaps{

    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Encaps(int id, String name){
        System.out.println("Hello from constructor: " + id + " , " + name);
    }

    static String company = "Capgemini";

    static void display(){
        System.out.println("Hello from static: " + company);
    }

    static{
        System.out.println("Hello from static block and i'm going to execute on top of every other thing in this class");
    }

    

}

public class Encap {
    public static void main(String[] args) {
        Encaps obj = new Encaps(1007, "Roy");
        obj.setId(1);
        obj.setName("yogesh");
        System.out.println("Roll no: " + obj.getId() + " , Name: " + obj.getName());

        Encaps.display();
    }
    
}
