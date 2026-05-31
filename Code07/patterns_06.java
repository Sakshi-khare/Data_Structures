// Print the pattern 

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5



package Code07;

public class patterns_06 {

 public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++){          // rows
            for(int j = 1; j <= i; j++){      // columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}




// 🧠 Approach 

// STEP 1: Pattern observe karo
// rows = n
// columns har row me increase ho rahe hain

// STEP 2: Same pattern hai?
// structure same hai (half pyramid jaisa)
// bas "*" ki jagah numbers print honge

// STEP 3: Outer loop → rows (i = 1 to n)

// STEP 4: Inner loop → columns (j = 1 to i)

// STEP 5: Kya print karna hai?
// "*" nahi, j print karna hai

// STEP 6: Logic
// row 1 → 1
// row 2 → 1 2
// row 3 → 1 2 3

// STEP 7: Har row ke baad new line

// STEP 8: Dry run
// i=3 → j=1,2,3 → 1 2 3