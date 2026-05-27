// ✅ Q6. Positive / Negative / Zero

package Code03;
import java.util.*;

public class Number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n>0) {
            System.out.println("The no is Positive");
        }
        else if (n<0) {
            System.out.println("The no is negative");
        }
        else{
            System.out.println("Zero");
        }
        
    }
    
}
