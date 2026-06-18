// Print only even and odd elements

package Arrays_11;

public class evenOdd {
    public static void main(String[] args) {
        int arr []= {1, 2, 3, 4, 5};
        int n = arr.length;

        // even elements

        System.out.println("Even elements: ");

        for(int i = 0; i< n-1;i++){
            if (arr[i]%2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        // Odd elements

        System.out.println("\n Odd elements: ");
        for(int i = 0; i< n; i++){
            if (arr[i]%2!=0) {
                System.out.print(arr[i] + " ");
                
            }
        }

       
    }
    
}
