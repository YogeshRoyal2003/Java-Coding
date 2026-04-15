package Practice10thApril;

enum Laptop{
    Macbook(2000), Surface(1000), XPS, ThinkPad(1500) ;

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class enumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        lap.setPrice(2500);
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lapi : Laptop.values()){
            System.out.println("Model: " + lapi + " , " + " Price: " + lapi.getPrice());
        }
    }
}
