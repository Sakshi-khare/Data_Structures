// Find Maximum element in array

package Arrays_10;

public class MaximumValue {
    public static void main(String[] args) {
        int arr[]={3,2,-5,21,10};
        int n = arr.length;

        //Suppose kiya ki arr[0] pe max element hai 

        int maxValue=arr[0];

        // compare maxValue ko array k har element k sth
         for(int i = 0; i<=n-1;i++){
            if (arr[i]>maxValue) {
                // update maxValue
                maxValue=arr[i];
            }
        }
        System.out.println(maxValue);
    }
}
       
