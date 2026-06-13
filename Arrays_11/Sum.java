// Sum of even and Odd  elements

package Arrays_11;

public class Sum {
    public static void main(String[] args) {
        
        // Initialization of array

        int arr [] = {5, 10, 15, 20, 25};
        int n = arr.length;
        int Evensum = 0;
        int Oddsum = 0;

        // Traversing of each element

        for(int i = 0; i<=n-1; i++){
            
            // Condition to check a number is even or odd

            if (arr[i]%2==0) {
               Evensum = Evensum + arr[i];
            }
            else{
                Oddsum = Oddsum + arr[i];
            }
        }
        System.out.println("The sum of even numbers in array is: " + Evensum);
        System.out.println("The sum of Odd elements in array is: "+ Oddsum);
    }
    
}
