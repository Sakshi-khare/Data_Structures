// 5. Enter 3 numbers from the user & make a function to print their average. 

package Practice;
import java.util.*;


public class q5 {

     public static double averageNUmbers(int a, int b, int c){
        double average = (a + b + c ) /3.0;
                return average;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

         System.out.println("Enter b:");
        int b = sc.nextInt();

         System.out.println("Enter c:");
        int c = sc.nextInt();

        // calling function

        double result = averageNUmbers(a,b,c);
        System.out.println(result);


        
    }
    
}
