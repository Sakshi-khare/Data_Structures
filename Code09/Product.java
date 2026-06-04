// Make a function to mutliply 2 numbers and return the product


package Code09;

import java.util.Scanner;

public class Product {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return (product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
          
        int product = calculateProduct(a, b);
        System.out.println("Product of 2 numbers is :" + product);
    }
    
}
