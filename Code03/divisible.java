// 🟠 Q7. Divisible by 5 and 11


package Code03;
import java .util.*;

public class divisible {
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        // check divisibilty

        if (n%5==0 && n%11==0) {

            System.out.print("The number is divisible");
            
        }
        else{
            System.out.print("The number is not divisible");
        }

    
}
}
