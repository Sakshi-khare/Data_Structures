// Find the index of maximum and minimum element

package Arrays_11;

public class countMaxMin {
    public static void main(String[] args) {
        int [] arr = {5, 2, 9, 1, 7};

        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i<arr.length; i++){
            if (arr[i]>arr[maxIndex]) {
                maxIndex=i;
            }
            if (arr[i]<arr[minIndex]) {
                minIndex=i;
                
            }
        }
        System.out.println("Max index:" + maxIndex);
          System.out.println("Min index:" + minIndex);
    }
    
}
