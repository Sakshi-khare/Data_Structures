// HALF PYRAMID
// *
// **
// ***
// ****

package Code07;

public class patterns_03 {
    public static void main(String[] args) {
          
        int n = 4;
          for(int i =1; i <=n ; i++){

            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
        
    }
}



// 👉 Yeh pattern  yeh sikhata hai:

// “Inner loop fixed nahi hota, outer loop pe depend karta hai”


// 🧠 STEPWISE APPROACH

// STEP 1: Pattern observe karo
// rows = 4
// columns fix nahi hai, har row me increase ho rahe hain

// STEP 2: Check karo kya pattern same hai?
// nahi → har row me stars badh rahe hain

// STEP 3: Outer loop (rows ke liye)
// i = 1 se n tak chalega

// STEP 4: Inner loop (columns ke liye)
// columns depend karte hain row number pe

// STEP 5: Kya print karna hai?
// "*" print karna hai

// STEP 6: Condition
// j <= i (jitni row, utne stars)

// STEP 7: Har row ke baad new line
// System.out.println();

// STEP 8: Dry run
// i = 1 → j=1 → *
// i = 2 → j=1,2 → * *
// i = 3 → j=1,2,3 → * * *