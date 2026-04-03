package Abstraction;

enum Laptops{
    Macbook(2000), Thinkpad(1500), Xps(1700), Surface, surfacePro(1900);

    private int price;

    private Laptops(){
        price = 500;
    }

    private Laptops(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
  public static void main(String[] args) {
    Laptops[] lap = Laptops.values();
    for(Laptops lapi : lap){
        System.out.println(lapi + " : " + lapi.getPrice());
    }
  }  
}
