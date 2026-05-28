// 👉 Print odd numbers from 1 to N

package Code06;
import java.util.*;



public class odd {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter N: ");
        int N = sc.nextInt();

        // 1st logic

        // for(int i = 1; i<=N; i++){
        //     if (i%2!=0) {
        //         System.out.println(i);
        //     }
        // }

        // 2nd logic

        for(int i = 1; i<=N; i=i+2){
        
                System.out.println(i);
        
    
}
 }
}
