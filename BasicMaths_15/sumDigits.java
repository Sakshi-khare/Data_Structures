// 3. Sum of digits

package BasicMaths_15;

public class sumDigits {
    static int sumDigits(int num){
    
        int sum = 0;

        while (num!=0) {

         int digit = num % 10;   
               
         num = num/10;

         sum = sum + digit;

            //last digit remove 
        }

        return sum ;

    }
    public static void main(String[] args) {
        int num = 53127;
        int sum = sumDigits(num);
        System.out.println(sum);
    }
    
}


