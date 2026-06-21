// 7. Take two strings and print them concatenated.

package Strings_14;

public class concatened {
    public static void main(String[] args) {
        String firstname = "shiva";
        String lastname = "sakshi";

        // 1st way to directly add strings

    //   System.out.println(firstname + " " + lastname);

        // 2nd way using concat()method inbuilt function()
          
        System.out.println(firstname.concat(" " + lastname));
    }
    
}
