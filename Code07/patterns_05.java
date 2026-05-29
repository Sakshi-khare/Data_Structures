// INVERTED HALF PYRAMID ( rotated by 180 deg )

//    *
//   **
//  ***
// ****    

package Code07;

public class patterns_05 {
    public static void main(String[] args) {
        int n = 4;

        // outer loop

        for(int i = 1; i<=n ; i++){
            // inner lopp => space print 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // inner loop => star print 

            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// “Pattern = spaces + stars combination”

// 👉 yahan:

// spaces decreasing
// stars increasing


// 🧠 STEPWISE APPROACH

// STEP 1: Pattern observe karo
// rows = 4
// stars increase ho rahe hain (like normal pyramid)
// but starting me spaces aa rahe hain

// STEP 2: Pattern same hai ya change?
// change hai → space + star dono print honge

// STEP 3: Outer loop (rows ke liye)
// i = 1 se n tak chalega

// STEP 4: Inner loop 1 → spaces ke liye
// har row me starting me spaces print honge
// spaces = (n - i)

// STEP 5: Inner loop 2 → stars ke liye
// stars increase ho rahe hain
// j <= i

// STEP 6: Kya print karna hai?
// pehle spaces (" ")
// phir stars ("*")

// STEP 7: Har row ke baad new line
// System.out.println();

// STEP 8: Dry run
// i=1 → 3 spaces + 1 star →       *
// i=2 → 2 spaces + 2 stars →     * *
// i=3 → 1 space  + 3 stars →   * * *
// i=4 → 0 space  + 4 stars → * * * *