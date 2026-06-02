// 1.	Print a solid rhombus.

//      *****
//    *****
//   *****
//  *****
// *****


package Code08;

public class patterns_10 {
    public static void main(String[] args) {
        int n = 5;

          for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}



/*
Solid Rhombus Pattern - Step by Step Approach

Step 1: Sabse pehle n decide karo

* n = number of rows
* Har row me n stars honge

Step 2: Outer loop lagao (rows ke liye)

* i = 1 se n tak chalega
* Har iteration ek row print karega

Step 3: Spaces print karo (left side shift ke liye)

* Har row me spaces kam hote jayenge
* Formula: spaces = n - i
* Example:
  i = 1 → 4 spaces
  i = 2 → 3 spaces
  i = 3 → 2 spaces

Step 4: Stars print karo

* Har row me fix n stars print honge
* Isliye shape "solid" rhombus dikhta hai

Step 5: Har row ke baad next line

* System.out.println() use karo

Step 6: Final samajh

* Pattern = spaces + stars
* Stars constant hai
* Spaces decrease hote ja rahe hai
* Isi wajah se shape tilt hota hai (rhombus banta hai)
  */


