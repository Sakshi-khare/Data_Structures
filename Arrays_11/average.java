// Find the average of array elements

package Arrays_11;

public class average {
    public static void main(String[] args) {
        int[]arr={2,4,6,8};
        int sum = 0;
        int n = arr.length;

        // 1.calculate sum

        for(int i = 0; i <n; i++){
            sum = sum + arr[i];
        }

        // 2. Calculate average

        double avg = (double)sum/n;

        // 3. print
        
        System.out.println("The average of elements is:"+avg);
    
    }
    
}
