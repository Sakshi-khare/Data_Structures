// Print all integers in range from 50 to 100 that are perfectly divisible by 7


package Code06;

public class integer {
     public static void main(String[] args) {

        int n = 100;

        for(int i = 50; i<=n; i++){

            if (i%7==0) {
                
                System.out.println(i);
            }
        }
    
}
}