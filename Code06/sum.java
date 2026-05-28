// 👉 Find sum of numbers from 1 to N
// 👉 Find sum of even numbers from 1 to N

package Code06;
import java.util.*;


public class sum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter N: ");
        int N = sc.nextInt();
        // sum of numbers
        
        int sum =0;

        for(int i =1; i<=N; i++){
           sum=sum+i;
        }
      System.out.println("Sum: " + sum);

      // sum of even numbers

      for(int i =1; i<=N; i++){
        if(i%2==0){
            sum= sum+i;
        }
      }
      System.out.println("Sum:"+sum);
}
}