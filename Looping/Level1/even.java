// 2. Print all even numbers between 1 and 100.

package Looping.Level1;

public class even {
    public static void main(String[] args) {
        
        int n = 100;

        // Print all even numbers

        for(int i = 1; i<=n; i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    
}
