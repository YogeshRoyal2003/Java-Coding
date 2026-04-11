package Practice10thApril;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

       int arr [][] = new int[3][4];

       for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            arr[i][j] = (int)(Math.random() * 100);
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }

       System.out.println("Jagged arrays-----------------------------------");

       int jagArr[][] = new int[3][];
       jagArr[0] = new int[3];
       jagArr[1] = new int[4];
       jagArr[2] = new int[5];

       for(int i=0; i<jagArr.length; i++){
        for(int j=0; j<jagArr[i].length; j++){
            jagArr[i][j] = (int)(Math.random()*10);
            System.out.print(jagArr[i][j]+ " ");
        }
        System.out.println();
       }

    }
}
