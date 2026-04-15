package Practice10thApril;

enum Days{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class enums {
    public static void main(String[] args) {
        Days d = Days.Monday;
        System.out.println(d.ordinal());

        if(d == Days.Friday){
            System.out.println("Its Friday yay!!");
        }
        else if(d == Days.Monday){
            System.out.println("Its the starting of the week....nah nah...");
        }
        else{
            System.out.println("Its mid of the week do your work");
        }

        Days day[] = Days.values();
        System.out.println(day[0]);

        for(Days da : day){
            System.out.println(da + " : " + da.ordinal());
        }

        Days da = Days.Thursday;
        switch(da){
            case Monday:
                System.out.println("Its the starting of the week......");
                break;
            case Friday:
                System.out.println("Its friday yay!!");
                break;
            default:
                System.out.println("Its mid of the week");
        }
    }
}
