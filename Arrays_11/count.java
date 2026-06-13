// count number of odd and even elements in array

package Arrays_11;

public class count {
    public static void main(String[] args) {
        int arr []= {2,3,5,8,9};
        // int count = arr.length;

        int evenCount = 0;
        int oddCount = 0;

        // for even

        for(int i = 0; i < arr.length; i++){

        if (arr[i]%2==0) {
            evenCount ++;
            
        }
        else{
            oddCount++;
        }
    }

    System.out.println("Even count:" + evenCount);
    System.out.println("Odd count:"+ oddCount);
    
}
}