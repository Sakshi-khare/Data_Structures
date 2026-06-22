// 4. Reverse a number

package BasicMaths_15;

public class reverseNumber {

    static int reverseNumber(int num){
        int revNum = 0;

        // ans = ans+10 + currentDigit

        while (num!=0) {
            int digit = num % 10;

            // reverse number 

            revNum = revNum*10+digit;

            // remove lastdigit

            num = num +10;
            
        }
            return revNum;
    }
    public static void main(String[] args) {
        int num = 1234;
        int revNum= reverseNumber(num);
        System.out.println(revNum);
    }
    
}
