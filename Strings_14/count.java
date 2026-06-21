// 4. Count how many characters (excluding spaces) are in the string.

// replace/remove spaces + length()=> counts only non-space characters
// length=> counts everything

package Strings_14;

public class count {
    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(s.length());
       int count  = s.replace(" ", "").length();
        System.out.println("The number of charcters excluding space: "+ count);
        
    }
}
