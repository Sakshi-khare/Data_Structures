// 7. Write a function to print the sum of all odd numbers from 1 to n. 


package Practice;
import java.util.*;

public class q6 {


    public static int sumOfOdd(int n){
        int sum=0;
        for(int i  = 1; i<=n; i++){
            if (i%2!=0) {
                sum = sum +i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result=sumOfOdd(n);
        System.out.println(result);
    }
}
