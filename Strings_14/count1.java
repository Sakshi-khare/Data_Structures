// 5.Count how many words are in a sentence.

package Strings_14;

public class count1 {
    public static void main(String[] args) {
        String s = "Hello World from java";

        int count = 0;

        for(int i = 0; i<s.length();i++){
            // check start of a word
            if(s.charAt(i)!=' '&& (i==0|| s.charAt(i-1)==' ')){
                count ++;

            }
        }
        System.out.println("Number of words: " + count);
    }
    
}
