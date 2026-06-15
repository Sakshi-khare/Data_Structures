// Take a matrix as input from the user .Search for a given number x and print the indices at which it occurs
// Explanation = > Basically we have to do Traversing and find the location of cell

package Arrays_12;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // input 2D Array

    System.out.println("Enter no of rows:");
    int rows = sc.nextInt();

    System.out.println("Enter no of columns:");
    int cols = sc.nextInt();

    int [][] numbers = new int [rows][cols];

    // input 
    // rows 

    for(int i = 0; i<rows; i++){

        // columns

        for(int j = 0; j<cols; j++){

            numbers[i][j]=sc.nextInt();
        }
    }
       System.out.print("Enter x");
       int x = sc.nextInt();

       for(int i = 0; i<rows; i++){
        for(int j = 0; j<cols; j++){

            // compare with x 

            if (numbers[i][j]==x) {
                System.out.println("x at found location (" + i + ","+ j + ")");
                
            }
        }
       }
     
    }
    
}
