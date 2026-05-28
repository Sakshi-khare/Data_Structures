// 👉 Print numbers from 1 to N
// 👉 but skip multiples of 3

package Code06;
import java.util.*;

public class Number {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        int N = sc.nextInt();

        for(int i =1; i<=N; i++){
            if (i %3!= 0) {
                System.out.println(i);
                
            }
        }
    
}
}