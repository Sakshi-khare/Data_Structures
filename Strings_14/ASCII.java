// 8. Print the ASCII value of string 
// ACSCII value = > numeric value of a charcter

package Strings_14;

public class ASCII {
    public static void main(String[] args) {
        String s = "Hello";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int )ch;

            System.out.println(ch + "->"+ascii);
        }
    }
    
}
