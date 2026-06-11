// How to take input in Arrays

package Arrays_10;
import java.util.*;

public class array {
    public static void main(String[] args) {
        int arr[]=new int [5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        // input

        for(int i =0; i<n; i++){
            System.out.println("Provide input for index" + i);
            arr[i]=sc.nextInt();
        }

        //print => using for Each loop

        System.out.println("Your array contains: ");
        for(int val: arr){
            System.out.println(val);
        }
    }
    
}
