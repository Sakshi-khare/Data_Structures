// Print all even numbers till n.


package Code05;
import java.util.*;

public class even {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n: ");
        int n = sc.nextInt();

        for(int i = 2; i<=n; i = i+2){
            
                System.out.println(i);
           
        }
    
}
}