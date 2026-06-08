// 5. Reverse a number

package Level1;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter number:");
    int n = sc.nextInt();

    // reverse number

    for(int i=n ; i>=1; i--){
        System.out.println(i);
    }
        
    }
}
