package Abstraction;

enum Directions{
    North, South, East, West;
}

public class Enum {
    public static void main(String[] args) {
        Directions obj = Directions.North;
        System.out.println(obj);

        System.out.println("----------------------------------------");

        Directions[] d = Directions.values();
        for(Directions dir : d){
            System.out.println(dir + " : " + dir.ordinal());
        }

        System.out.println("-----------------------------------------");

        Directions dir = Directions.North;
        if(dir == Directions.North){
            System.out.println("Go North to the wall");
        }
        else if(dir == Directions.South){
            System.out.println("Go South to kings landing");
        }
        else if(dir == Directions.East){
            System.out.println("Go East to pentos");
        }
        else{
            System.out.println("Go West to bravos");
        }


        switch (dir) {
            case North:
                System.out.println("Go North");
                break;
            case South:
                System.out.println("Go South");
                break;
            case East:
                System.out.println("Go East");
        
            default:
                System.out.println("Go West");
                break;
        }
    }
}
