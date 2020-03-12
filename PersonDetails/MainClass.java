
package mypackage;

import java.util.Scanner;


public class MainClass {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] names = new String[3];
        int [] years = new int[3];
        
        for (int i =0; i<names.length; i++){
        System.out.print("Please enter your name: ");
        String name = sc.next();
        names[i] = name;
        System.out.print("Please enter your birth year: ");
        int year = sc.nextInt();
        years[i] = year;
        }
        for (int i =0; i<names.length; i++){
        System.out.println("--------------");
        System.out.println("Name: "+ names[i]);
        System.out.println("Year of birth: " + years[i]);
        }
        
    }
    
}
