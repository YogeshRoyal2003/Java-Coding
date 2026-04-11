package Practice10thApril;

public class jag2darr {
    public static void main(String[] args) {

        System.out.println("2D array with loaded data");
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(arr[0][2]);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2D arrays- empty first and then add data to it");

        int arr1[][] = new int[3][4];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                arr1[i][j] = (int)(Math.random()*10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Jagged 2-d arrays");
        int arr2[][] = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[4];
        arr2[2] = new int[5];

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j] = (int)(Math.random()*10);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
