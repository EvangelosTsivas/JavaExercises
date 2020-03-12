
package mypackage;

import java.util.Scanner;


public class MainClass {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the width of the rectangle(m): ");
        float width = sc.nextFloat();
        System.out.print("Please enter the height of the rectangle(m): ");
        float height = sc.nextFloat();
        float area = width * height ;
        float perimeter = (width+height)*2;
        System.out.printf("Area is: %.2f %c\n",area,'\u33A1');
        System.out.printf("Perimeter is: %.2f %c\n",perimeter,'m');
    }
    
}
