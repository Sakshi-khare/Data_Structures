// Floyd's Triangle

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15





package Code07;

public class patterns_08 {
    public static void main(String[] args) {
        int n =5;
        int number = 1;
        // outer loop
        for(int i =1; i<=n; i++){
            // inner loop

            for( int j=1; j<=i;j++){
                System.out.print(number + " ");
                number++;
            }

               System.out.println();
        }
    }
    
}


// 🧠 Approach 

// STEP 1: Pattern observe karo
// rows = n
// numbers continuously increase ho rahe hain

// STEP 2: Same pattern hai?
// half pyramid jaisa structure hai
// but yaha numbers repeat nahi hote, continue hote hain

// STEP 3: Outer loop → rows (i = 1 to n)

// STEP 4: Inner loop → columns (j = 1 to i)

// STEP 5: Kya print karna hai?
// ek variable (num) use karenge jo har baar increase hoga

// STEP 6: Logic
// row 1 → 1
// row 2 → 2 3
// row 3 → 4 5 6
// row 4 → 7 8 9 10

// STEP 7: Har print ke baad num++ karna hai

// STEP 8: Har row ke baad new line

// STEP 9: Dry run
// i=1 → num=1 → 1
// i=2 → num=2,3 → 2 3
// i=3 → num=4,5,6 → 4 5 6
// i=4 → num=7,8,9,10 → 7 8 9 10