// HALF INVERTED PYRAMID

// ****
// ***
// **
// *


package Code07;

public class patterns_04 {
    
    public static void main(String[] args) {
        int n =4;

        for(int i =n; i>=1 ; i--){
            for (int j=1; j<=i ;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// “Outer loop reverse me chal raha hai
// → aur inner loop directly i pe depend kar raha hai”


// 🧠 STEPWISE APPROACH

// STEP 1: Pattern observe karo
// rows = 4
// columns har row me decrease ho rahe hain

// STEP 2: Check karo pattern same hai ya change?
// change ho raha hai → stars kam ho rahe hain har row me

// STEP 3: Outer loop (rows ke liye)
// i = n se start ho raha hai (4 se 1 tak)
// matlab reverse loop use ho raha hai

// STEP 4: Inner loop (columns ke liye)
// har row me jitni value i ki hogi utne stars print honge

// STEP 5: Kya print karna hai?
// "*" print karna hai

// STEP 6: Logic samjho
// row 1 → i = 4 → 4 stars
// row 2 → i = 3 → 3 stars
// row 3 → i = 2 → 2 stars
// row 4 → i = 1 → 1 star

// STEP 7: Har row ke baad new line
// System.out.println();

// STEP 8: Dry run
// i=4 → j=1 to 4 → ****
// i=3 → j=1 to 3 → ***
// i=2 → j=1 to 2 → **
// i=1 → j=1 to 1 → *