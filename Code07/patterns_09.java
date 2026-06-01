// 0-1 Traingle

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


package Code07;

public class patterns_09 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if (sum%2==0) {       // even
                    System.out.print("1 ");
                    
                }else{               // odd 
                     System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}






// 🧠 Approach 

// STEP 1: Pattern observe karo
// rows = n
// har row me 0 aur 1 alternate ho rahe hain

// STEP 2: Same pattern hai?
// half pyramid jaisa structure hai
// but numbers 0 aur 1 me alternate ho rahe hain

// STEP 3: Outer loop → rows (i = 1 to n)

// STEP 4: Inner loop → columns (j = 1 to i)

// STEP 5: Kya print karna hai?
// (i + j) even hoga to 1 print karo
// (i + j) odd hoga to 0 print karo

// STEP 6: Logic
// row 1 → 1
// row 2 → 0 1
// row 3 → 1 0 1
// row 4 → 0 1 0 1

// STEP 7: Condition check
// (i + j) % 2 == 0 → 1
// else → 0

// STEP 8: Har row ke baad new line

// STEP 9: Dry run
// i=1 → j=1 → (1+1)=2 even → 1
// i=2 → j=1 → (2+1)=3 odd → 0
//      j=2 → (2+2)=4 even → 1
// i=3 → j=1 → 1
//      j=2 → 0
//      j=3 → 1
