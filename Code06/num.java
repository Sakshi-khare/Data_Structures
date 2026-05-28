// Print numbers from 1 to N
// Print numbers from N to 1

package Code06;
import java.util.*;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        int N = sc.nextInt();

        // FROM 1 to N => Counting

        for(int i=1; i <= N ; i++){
            System.out.println(i);
        }

        // from N to 1 => REVERSE

        for(int i = N; i>=1; i--){
            System.out.println(i);
        }

    }

    
}
