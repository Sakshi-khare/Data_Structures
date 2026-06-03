// print a  centered number pyramid 
//  1
//    222
//   33333
//  4444444
// 555555555




package Code08;

public class patterns_11 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}




/*
Centered Number Pyramid - Step by Step (Hinglish)

Step 1: n decide karo

* n = total rows

Step 2: Outer loop (rows ke liye)

* i = 1 se n tak

Step 3: Spaces print karo (center alignment ke liye)

* Har row me spaces decrease hote hain
* Formula: spaces = n - i

Step 4: Numbers print karo

* Har row me same number print hoga = i

Step 5: Count of numbers observe karo

* Pattern: 1, 3, 5, 7, 9...
* Formula: (2*i - 1)

Step 6: Inner loop for numbers

* j = 1 se (2*i - 1) tak chalega

Step 7: Har iteration me i print karo

* System.out.print(i)

Step 8: Har row ke baad next line

* System.out.println()

Step 9: Final understanding

* Pattern = spaces + numbers
* Spaces decrease ho rahe hai
* Numbers increase (odd count me)
* Isi wajah se pyramid center me banta hai
  */
