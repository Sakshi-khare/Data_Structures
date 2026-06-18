// sum of first and last element 

package Arrays_11;

public class sum1 {
    public static void main(String[] args) {
        
        // intialization of array

        int [] arr = {2, 4, 5, 6, 8};
        int n = arr.length;
        int sum = arr[0]+ arr[n-1];

        System.out.println("The sum of first and last element is:" + sum);
    }
    
}
