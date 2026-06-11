// TOPIC : ARRAYS 

package Arrays_10;

public class Main {
    public static void main(String[]args){

    // decalaration + intialization

    int arr[]={10,20,30,40,50};
    
    // int n = arr.length;

    // Accessing elements in array

//    System.out.println("Value at index 0 = " + arr[0]);
//    System.out.println("Value at index 1 = " + arr[1]);
//    System.out.println("Value at index 2 = " + arr[2]);
//    System.out.println("Value at index 3 = " + arr[3]);
//    System.out.println("Value at index 4 = " + arr[4]);

// Accessing elements in array with loops

// for(int index = 0; index <=n-1; index++ ){
//     System.out.println(arr[index]);
// }

// For Each Loop

for(int val:arr){
    System.out.println(val);
}
    
}
}