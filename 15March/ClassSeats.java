package classseats;

import java.util.Random;
import java.util.Scanner;

public class ClassSeats {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of students: ");
        int students = input.nextInt();
        int seats = students / rows;
        int spareSeats = students % rows;

        String[][] classroom = new String[rows][];

        for (int i = 0; i < rows - 1; i++) {
            classroom[i] = new String[seats];
        }
        classroom[rows - 1] = new String[seats + spareSeats];

        Random random = new Random();

        while (students > 0) {
            int randomRow = random.nextInt(rows);
            int randomColumn = random.nextInt(seats + spareSeats);

            if (randomColumn < seats) {
                if (classroom[randomRow][randomColumn] == null) {
                    System.out.printf("\n%d seats are empty!", students);
                    System.out.printf("\nPlease enter a name for seat[%d][%d]: ", randomRow, randomColumn);
                    String name = input.next();
                    classroom[randomRow][randomColumn] = name;
                    students -= 1;

                }
            } else if (randomColumn >= seats) {
                if (classroom[rows - 1][randomColumn] == null) {
                    System.out.printf("\n%d seats are empty!", students);
                    System.out.printf("\nPlease enter a name for seat[%d][%d]: ", rows - 1, randomColumn);
                    String name = input.next();
                    classroom[rows - 1][randomColumn] = name;
                    students -= 1;

                }
            }
        }
        System.out.printf("\nThank you!");
        System.out.println();

        System.out.println("        ***** Structure of Class *****");

        for (String[] classroom1 : classroom) {
            System.out.println();
            for (String classroom11 : classroom1) {
                System.out.print("\t" + classroom11 + " ");
            }
        }
        System.out.println();

    }
}
