// Functions / Methods
// Methods => it is a entity which enables us to reuse a block of code



// Basic syntax of method  
// returnType methodName(parameters){ method body }

// to run any method we used a terminology call / invoke a method

// run -> call -> methodName(argument)




//Print a given name in a function

package Code09;

import java.util.Scanner;

public class Functions {

    // Function decalaration

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {

        // Function call

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);     // call kiya function ko
    }
    
}
