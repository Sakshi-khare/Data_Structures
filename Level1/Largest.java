// 2. Find largest of 3 number

package Level1;
import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter Num3");
        int num3 = sc.nextInt();

        if (num1>=num2 && num1>=num3) {
            System.out.println(num1 +" is greater");
            
        }
        else if (num2 >=num3 && num2>=num3) {
            System.out.println(num2 + " is greater");
            
        } 
        else {
            System.out.println(num3 +" is greater");
        }
    }
    
}
