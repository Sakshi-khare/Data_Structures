// Print the sum of first n natural number => n=4

package Code05;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
}
