// Find sum of first half and second half elements


package Arrays_11;
import java.util.*;

public class halfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // step 1 : Input Size

        System.out.println("Enter numbers of elements: ");
        int n = sc.nextInt();
        
        int [] arr = new int[n];

        // step 2 : Input elements

        System.out.println("Enter elements:");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();

        }

        // step 3 : Find midpoint
        int mid = n / 2;
     
        int sum1 = 0;      // first half
        int sum2 = 0;      // second half

        // step 4 : traverse array

        for(int i = 0; i<n; i++){
           if(i<mid){
            sum1 = sum1+ arr[i];
           }
           else{
            sum2 = sum2 + arr[i];
           }

        }

        // step 5 : Output

        System.out.println("Sum of first half = " +sum1);
                System.out.println("Sum of second  half = " +sum2);

    }
    
}
