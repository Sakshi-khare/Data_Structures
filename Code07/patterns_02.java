// HOLLOW RECTANGLE  
// *****
// *   *
// *   *
// *****


package Code07;

public class patterns_02 {
    public static void main(String[] args) {
        int n = 4;   // rows
        int m = 4 ;  // columns
        for(int i =1; i<=n ; i++){          // every row
                 for(int j =1; j<=m; j++){
                    if(i==1 || i==n || j==1|| j==m){
                        System.out.print("*");
                    } 
                    else{
                        System.out.print(" ");
                    }
                 }
                 System.out.println();
        }
    }
}
















// 👉Approach + THINKING

// STEP 1: Pattern observe
// rows = 4
// columns = 4

// STEP 2: Har jagah same nahi hai
// boundary pe star hai, andar space hai

// STEP 3: Outer loop → rows ke liye (i loop)

// STEP 4: Inner loop → columns ke liye (j loop)

// STEP 5: Print kya karna hai?
// "*" ya " "

// STEP 6: Condition
// agar (i == 1 || i == n || j == 1 || j == n)
// → print "*"
// warna → print space

// STEP 7: Har row ke baad new line

// STEP 8: Dry run
// i=2, j=2 → andar hai → space
// i=1 → full star row