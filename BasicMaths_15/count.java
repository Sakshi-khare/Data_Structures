// 2. Count Digits of a numbers

package BasicMaths_15;

public class count {

    static int countDigits(int num){
        // agar num=0 , so stop
        // age num!=0 , so it continues

        int count = 0;

        while (num!=0) {
               
         num = num/10;

         count ++;

            //last digit remove 
        }

        return count ;

    }
    public static void main(String[] args) {
        int num = 53127;
        int ans = countDigits(num);
        
        System.out.println("Number of digits: " + ans);
    }
    
}

