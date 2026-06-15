// 2D Arrays => Creating a 2D Array - with new keyword taking a matrix as ab input and printing its elements

package Arrays_12;
import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input rows and columns

        System.out.println("Enter rows");
        int rows = sc.nextInt();
       
        System.out.println("Enter columns");
        int cols = sc.nextInt();
     
          
        // Decalaration of 2D Array

        int[][] numbers= new int[rows][cols];

        // give input same as in 1D Array with the help of loop

        // rows

        for(int i = 0; i<rows;i++){

            // columns

            for(int j = 0; j<cols; j++){

                numbers[i][j]=sc.nextInt();

            }
        }

        // output
        
        for(int i = 0; i<rows; i++){
            for(int j = 0 ; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();

        }
        
    }
    
}
