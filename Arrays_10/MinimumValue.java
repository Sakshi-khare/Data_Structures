//Find minimum value of an array

package Arrays_10;

public class MinimumValue {
    
    public static void main(String[] args) {
        int arr[]={3,2,-5,21,10};
        int n = arr.length;

        int minValue=arr[0];

          for(int i = 0; i<=n-1;i++){
            if (arr[i]<minValue) {
                // update maxValue
                minValue=arr[i];
            }
        }
         System.out.println(minValue);
    
}
}
