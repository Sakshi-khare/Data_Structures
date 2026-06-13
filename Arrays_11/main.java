// Sum of Positive and negative elements

package Arrays_11;

public class main {
    public static void main(String[] args) {
        
        int arr [] = {-5,10,-15,20,-10};
        int n = arr.length;
        int positiveSum = 0;
        int NegativeSum = 0;

        // 
        for(int i = 0; i<n; i++){
            if (arr[i]>0) {
                positiveSum = positiveSum+arr[i];
            }
            else if (arr[i]<0)
            {
                NegativeSum=NegativeSum+arr[i];
            }
      
        }

             System.out.println("The sum of positive elements:"+positiveSum);
            System.out.println("The sum of negative elements:"+NegativeSum);
    }
    
}
