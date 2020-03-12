
package mypackage;

import java.util.Scanner;


public class MainClass {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price of your  product: ");
        float price = input.nextFloat();
        char euro = '\u20AC';
        System.out.printf("Discount 10%c = %.2f %c\n" ,'%',price*0.9,euro);
        System.out.printf("Discount 20%c = %.2f %c\n" ,'%',price*0.8,euro);
        System.out.printf("Discount 30%c = %.2f %c\n" ,'%',price*0.7,euro);
        System.out.printf("Discount 40%c = %.2f %c\n" ,'%',price*0.6,euro);
        System.out.printf("Discount 50%c = %.2f %c\n" ,'%',price*0.5,euro);
        System.out.printf("Discount 60%c = %.2f %c\n" ,'%',price*0.4,euro);
    }
    
}
