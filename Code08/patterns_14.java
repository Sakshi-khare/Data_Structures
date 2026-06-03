// print diamond pattern


//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *




package Code08;

public class patterns_14 {
    public static void main(String[] args) {
        
     int n = 5;

        // Upper part
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}

/*
Diamond Pattern - Step by Step (Hinglish)

Step 1: n decide karo

* n = half diamond ki height

Step 2: Upper pyramid print karo

* i = 1 se n tak

Step 3: Spaces print karo

* spaces = n - i

Step 4: Stars print karo

* stars = 2*i - 1

Step 5: Lower inverted pyramid print karo

* i = n-1 se 1 tak

Step 6: Same logic repeat karo

* spaces = n - i
* stars = 2*i - 1

Step 7: Har row ke baad next line

Step 8: Final understanding

* Diamond = 2 pyramids ka combination
* Upper increasing
* Lower decreasing
  */
