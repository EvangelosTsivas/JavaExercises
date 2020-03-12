
package mypackage;

import java.util.Scanner;


public class MainClass {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle : ");
        float radius = sc.nextFloat();
        
        float perimeter = (float) (2* radius * Math.PI);
        float area = (float) (radius * radius * Math.PI);
        char square = '\u33A1';
        System.out.printf("Perimeter is : %.2f %s\n", perimeter,"m");
        System.out.printf("Area is : %.2f %c\n" ,area,square);
        
    }
    
}
