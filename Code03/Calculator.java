// Question : Make a calculator . Take 2 numbers (a & b) from the user and an operation as follows:

// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.


package Code03;
import java .util.*;

public class Calculator {
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

         System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);


        switch (operator) {
            case '+':
                // Addition 
                System.out.println("Addition: " + (a + b));

                break;

             case '-':

                // Subtraction
                System.out.println("Subtraction: " + (a - b));

                break;
        
            case '*':
                // Mutliply 
                System.out.println("Multiplication: " + (a *  b)); 
                
                break;

            case '/':
                // Division 
                System.out.println("Division: " + (a / b));   

                break;

            case '%':
                // Modulus
                System.out.println("Modulus: " + (a % b));  
                
                break;

            default:
                System.out.println("Invalid Operator");

                break;
        }
        
        

    }
    
}
