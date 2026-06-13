// Count how many elements are positive negative or zero

package Arrays_11;

public class countElements {
    public static void main(String[] args) {
        int arr[] = {-2,4,-8,-9,20,0}; 
        int n = arr.length;
        int negativeCount=0;
        int positiveCount=0;
        int zeroCount =0;

        for(int i = 0; i<n; i++){
            if (arr[i]>0) {
                positiveCount++;
            }

            else if(arr[i]<0){
                negativeCount++;

            }
            else{
                zeroCount++;
            }
        }
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        }
    
}
