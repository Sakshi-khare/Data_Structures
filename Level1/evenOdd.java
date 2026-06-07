// 1. check even or odd

package Level1;
import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        // Check even or odd

        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}
