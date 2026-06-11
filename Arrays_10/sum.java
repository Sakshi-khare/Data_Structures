// Find sum of array

package Arrays_10;

public class sum {
    public static void main(String[] args) {
        
        // intialization of arr

        int arr [] = {10,20,30,40,50};
        int sum = 0;
        int n = arr.length;

        // Accessing elements and print sum

        for(int i = 0 ; i<=n-1; i++){
            int value = arr[i];
            sum = sum + value;
        }
        // sum is ready to print
        System.out.println(sum);
    }
    
}
