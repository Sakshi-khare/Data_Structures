// inverted half pyramid with numbers
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1



package Code07;

public class patterns_07 {
    public static void main(String[] args) {
        
        int n = 5;

        // outer loop 

        for(int i = 1 ; i<=n; i++){

            // inner loop 
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

// 🧠 Approach 

// STEP 1: Pattern observe karo
// rows = n
// columns har row me decrease ho rahe hain

// STEP 2: Same pattern hai?
// structure half pyramid jaisa hi hai
// bas ulta ho gaya (inverted)

// STEP 3: Outer loop → rows (i = n to 1)

// STEP 4: Inner loop → columns (j = 1 to i)

// STEP 5: Kya print karna hai?
// "*" nahi, j print karna hai

// STEP 6: Logic
// row 1 → 1 2 3 4 5
// row 2 → 1 2 3 4
// row 3 → 1 2 3
// row 4 → 1 2
// row 5 → 1

// STEP 7: Har row ke baad new line

// STEP 8: Dry run
// i=5 → j=1,2,3,4,5 → 1 2 3 4 5
// i=4 → j=1,2,3,4 → 1 2 3 4
// i=3 → j=1,2,3 → 1 2 3
// i=2 → j=1,2 → 1 2
// i=1 → j=1 → 1

