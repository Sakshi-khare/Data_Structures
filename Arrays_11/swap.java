// swap first and last elements

package Arrays_11;

public class swap {
    public static void main(String[] args) {
        int arr []={2, 4, 6, 8, 10};
        int n = arr.length;

        // Before Swapping

        System.out.println("Before swapping: ");

         for(int i = 0; i< n; i++){
         System.out.print(arr[i] + " ");
        }

        // Swapping

        int temp = arr[0];
        arr[0]= arr[n-1];
        arr[n-1]=temp;

        // After swapping print 
        
        System.out.println("\n After Swapping: ");


        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
