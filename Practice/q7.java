// 7. Write a function which takes in 2 numbers and returns the greater of those 
// two. 

package Practice;

import java.util.Scanner;


public class q7 {
    public static int findGreater(int a, int b){
          if(a>b){

            return a ;
          }
          else{
            return b;
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        int a = sc.nextInt();

        System.out.println("enter b: ");
        int b= sc.nextInt();

        int result=findGreater(a, b);
        System.out.println(result);
    }
    
}
