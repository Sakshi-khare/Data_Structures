// Create an array and mutilple all elements

package Arrays_10;

public class product {
    public static void main(String[] args) {
        int arr[] = {2,3,10,12};
        int ans=1;
        int n = arr.length;

        for(int i = 0; i<=n-1; i++){
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);
    }
    
}
