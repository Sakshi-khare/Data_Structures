package BasicMaths_15;

public class primeNum {
    static boolean isPrimeOrNot(int num){
        for(int i =2; i<=num-1; i++){
            if (num%i==0) {
                // not a prime 
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(isPrimeOrNot(num));
    }
}
