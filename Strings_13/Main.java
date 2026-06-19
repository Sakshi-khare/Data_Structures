// Topic : Strings => Collection of characters

//Creation of string

package Strings_13;

public class Main {
    public static void main(String[] args) {
        String firstName = "Love";
        String lastName = new String("cutuu");
        System.out.println(firstName + " " + lastName );
       
        // Accessing length of string

        System.out.println(firstName.length());

        // Accessing elements/characters in particular index

        System.out.println(firstName.charAt(0));
          System.out.println(firstName.charAt(1));
            System.out.println(firstName.charAt(2));
              System.out.println(firstName.charAt(3));

              // String is immutable


        // Comparing Strings

        //1. ( == ) operator

        String name1 = "Love";
        String name2 = "LOVE";

        if(name1==name2){
            System.out.println("Both strings are equal");
        }
        else
        {
            System.out.println("Both strings are not equal");
        }

        // 2. equals()

        if(name1.equals(name2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // 3. equalIgnoreCase()

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Equals");

        }
        else{
            System.out.println("Not equal");
        }
 

    }
    
}
