
package mypackage;

import java.util.Scanner;


public class MainClass {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float temp =  input.nextFloat();
        float celsius = (temp -32)*5/9;
        System.out.printf("Temp in Celsius is: %.2f %c \n" ,celsius ,'\u2103');
    }
    
}
