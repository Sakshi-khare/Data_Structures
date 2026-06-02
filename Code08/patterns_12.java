// print the centered plaindromic number pattern
//     1
//    212
//   32123
//  4321234
// 543212345


package Code08;


public class patterns_12 {
    public static void main(String[] args) {
        
    
    int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // decreasing (i to 1)
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // increasing (2 to i)
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

}