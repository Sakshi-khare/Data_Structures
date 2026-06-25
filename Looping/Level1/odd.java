// 3. Print all odd numbers between 1 and 100.

package Looping.Level1;

public class odd {
    public static void main(String[] args) {
        int n = 100;

        // print all odd numbers

        for(int i = 1; i<=n; i++){
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
    
}
