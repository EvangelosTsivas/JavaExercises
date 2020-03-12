
package mypackage;

import java.util.Scanner;


public class MainClass {

 
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number in inches: ");
        float inches = input.nextFloat();
        float meter = (float) (inches * 0.0254);
        System.out.printf("This is : %.4f %c\n",meter,'m');
        
    }
    
}
