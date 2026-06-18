// print elements in reverse order

package Arrays_11;

public class reverse {

    public static void main(String[] args) {
        int [] arr = {2,5,9,8};
        int n = arr.length;

        // Acessing elements in reverse order

        for(int i = n-1; i>0; i--){
            System.out.print(arr[i]+"");
        }
    }
    
}
