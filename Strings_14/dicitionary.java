// 8. Compare two strings lexicographically (like dictionary order). 

// lexicographically => dictionary order like apple < ball < cat < dog

package Strings_14;

public class dicitionary {
    public static void main(String[] args) {

        // Create 2 strings 
        String s1 = "Apple";
        String s2 = "ball";

        int result = s1.compareTo(s2);

        if (result<0) {
            System.out.println("s1 comes before s2");
            
        }
        else if(result>0){
            System.out.println("s1 comes after s2");
        }
        else{
            System.out.println("Both are equal");
        }
    }
    
}
