package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FamilyDetails {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Lets enter info about your family!");

        String nameOfFile = "/Users/Vagos/Documents/myFamily.txt";
        File file = new File(nameOfFile);
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.format("NAME\t AGE\t HEIGHT(m)\t WEIGHT(kg) ");

        writeFamilyMembersToFile(input, writer);

        writer.close();

        printTextFromFileUsingScanner(file);

    }

    public static void writeFamilyMembersToFile(Scanner input, PrintWriter writer) {
        while (true) {
            System.out.print("Please enter name of family member: ");
            String name = input.next();
           
             int age;
        do {
            System.out.print("Please enter age of family member: ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a number: ");
                input.next();
            }
           age = input.nextInt();
        } while (age < 0 || age > 100);
        
        
          float height;
          do {
            System.out.print("Please enter height of family member: ");
            while (!input.hasNextFloat()) {
                System.out.print("Please enter a number: ");
                input.next();
            }
            height = input.nextFloat();
        } while (height < 1.0 || height > 2.50);
           
         
          
          int weight;
          do {
            System.out.print("Please enter weight of family member: ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a number: ");
                input.next();
            }
            weight = input.nextInt();
        } while (weight < 20 || weight > 300);
           
           
            writer.format("\n%s\t %d\t %.2f\t %d\t ", name, age, height, weight);
            System.out.println("Person was succesfully created!");
            System.out.print("Do you want to exit? Type exit else no:  ");
            String exit = input.next();
            if (exit.equals("exit")) {
                break;
            }
        }

    }

    public static void printTextFromFileUsingScanner(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

}
