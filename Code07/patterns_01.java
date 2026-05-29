// Topics : Patterns => nested loops

//   *****
//   *****
//   *****
//   *****


package Code07;

public class patterns_01 {
    public static void main(String[] args) {
        int n = 4;     // => rows
        int m = 5;     // => columns

        // outer loop 

        for(int i =1; i <=n; i++){
           
            // inner loop

            for(int j =1; j <=m; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
    
}














// 👉 APPORACH +THINKING

// STEP 1: Pattern observe karo
// kitni rows hain? (vertical count)
// kitne columns hain? (horizontal count)

// STEP 2: Check karo kya har jagah same print ho raha hai?
// agar haan → simple pattern
// agar nahi → condition lagegi

// STEP 3: Outer loop (rows ke liye)
// outer loop decide karega kitni lines print hongi

// STEP 4: Inner loop (columns ke liye)
// inner loop decide karega ek row me kya print hoga

// STEP 5: Decide karo kya print karna hai
// "*" ya " " ya number

// STEP 6: Agar condition based pattern hai
// toh yaha condition likho (boundary ya logic)

// STEP 7: Har row ke baad next line
// System.out.println();

// STEP 8: Dry run mentally (i, j values check karo)
// ek-do cases verify karo