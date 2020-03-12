
package mypackage;

import java.util.Scanner;


public class MainClass {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter a time in seconds: ");
        int seconds = input.nextInt();
        int hours = seconds/3600;
        int remain = seconds  - hours*3600;
       
        int minutes = remain/60;
        remain = remain - minutes*60;
        int sec = remain ;
        
        System.out.println( hours +" Hours "+ + minutes +" Minutes " +sec + " Seconds");
        System.out.println(hours + " : "+ minutes +" : "+ sec);
       
    }
    
}
