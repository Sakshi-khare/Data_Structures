// 1. Print Digits of a number

package BasicMaths_15;

public class printDigits {

    static void printDigits(int num){
        // agar num=0 , so stop
        // age num!=0 , so it continues

        while (num!=0) {
             
            // last digit print

            int digit = num % 10;
            System.out.println(digit);

            //last digit remove 

            num = num/10;
        }

    }
    public static void main(String[] args) {
        int num = 53127;
        printDigits(num);
        
    }
    
}
