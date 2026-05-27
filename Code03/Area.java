// ✅ Q2. Area of rectangle

package Code03;
import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter length: ");
        int length=sc.nextInt();

        
        System.out.println("Enter breadth: ");
        int breadth=sc.nextInt();

        int area=length*breadth;

        System.out.print("The area of rectangle is: " + area);
    }
}
