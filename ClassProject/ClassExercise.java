package classexercise;

import java.util.Scanner;

public class ClassExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name ?");
        String userName = input.next();
        System.out.println("Ok " + userName + ". What is your gender?");
        System.out.print("Please enter M or F :");
        String userGender = input.next();
        System.out.println("What is your age " + userName + " ?");
        int userAge = input.nextInt();
        ageDetails(userAge, userName);
        System.out.println("---Seasons---");
        seasons(userName);
        System.out.println("---BMI---");
        bmi(userName);
        System.out.println("---Lycky Day---");
        String day = luckyDay(userAge);
        System.out.println("---To the club---");
        clubPermission(userName, userAge, userGender, day);

    }

    static void ageDetails(int userAge, String userName) {
        if (userAge > 0 && userAge <= 5) {
            System.out.println(userName + " you are too young for this app.");
            System.out.print("Come back in " + (6 - userAge) + " years when you will be a student.");
        } else if (userAge >= 6 && userAge <= 18) {
            System.out.println("Oh" + userName + "you are a student");
            System.out.print("Keep up... " + (18 - userAge) + " more years left and afterwards you will make money.");
        } else if (userAge >= 19 && userAge <= 40) {
            System.out.println("Well " + userName + ", you must be employed.");
            System.out.println("You finished school " + (userAge - 18) + " years ago.");
        }
        if (2020 - userAge < 1980) {
            int pastAge = 40 - userAge;
            System.out.println(userName + " in 1980 you were " + pastAge + " years old!");
        } else {
            System.out.println(userName + " you were not born in 1980! ");

        }
        int futureAge = userAge + 20;
        System.out.println("In 2040 you will be " + futureAge + " years old ! ");

    }

    static void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    static void seasons(String userName) {
        Scanner input = new Scanner(System.in);
        System.out.println(userName + " what is your favorite season? ");
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        printArray(seasons);
        System.out.print("Please enter the corresponting number: ");
        int seasonInput = input.nextInt();
        if (seasonInput == 1) {
            System.out.println("It must be cold outside");
        } else if (seasonInput == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        } else if (seasonInput == 3) {
            System.out.println("Let's go for swimming");
        } else if (seasonInput == 4) {
            System.out.println("The trees are full of brown leaves");
        }
    }

    static void bmi(String userName) {
        Scanner input = new Scanner(System.in);
        System.out.print(userName + " please enter your height: ");
        float height = input.nextFloat();
        System.out.print("Now enter your weight: ");
        int weight = input.nextInt();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is :%.2f\n " , bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }

    static int sumOfDigits(int days) {

        int sum = 0;

        while (days != 0) {
            sum = sum + days % 10;
            days = days / 10;
        }
        return sum;
    }

    static String luckyDay(int age) {
        int days = age * 365;
        int sum = sumOfDigits(days);

        if (sum > 6) {
            sum = sum % 7;
        }

        String luckyDay = "";
        if (sum == 0) {
            luckyDay = "Monday";
        } else if (sum == 1) {
            luckyDay = "Tuesday";
        } else if (sum == 2) {
            luckyDay = "Wednesday";
        } else if (sum == 3) {
            luckyDay = "Thursday";
        } else if (sum == 4) {
            luckyDay = "Friday";
        } else if (sum == 5) {
            luckyDay = "Saturday";
        } else if (sum == 6) {
            luckyDay = "Sunday";
        }

        System.out.println("Your lucky day is : " + luckyDay);
        return luckyDay;

    }

    static void clubPermission(String userName, int userAge, String userGender, String day) {
        Scanner input = new Scanner(System.in);
        System.out.println("So " + userName + " you want to enter the club? ");

        if (day.equals("Wednesday") && userAge >= 20 && userAge <= 40) {

            if (userAge >= 20 && userAge <= 25) {
                System.out.println("Welcome " + userName + "!");
            } else if (userAge > 25 && userGender.equals("M")) {
                System.out.println("Welcome Mr. " + userName + "!");
            } else if (userAge > 25 && userGender.equals("F")) {
                System.out.print("Are you married? ");
                String married = input.next();
                if (married.equals("yes")) {
                    System.out.println("Welcome Mrs. " + userName + " you can enter !");
                } else if (married.equals("no")) {
                    System.out.println("Welcome Mis. " + userName + " you can enter!");
                }
            }

        } else if (day != "Wednesday") {
            System.out.println("You cannot enter because your lucky day is  " + day);
        } else if (userAge < 20 || userAge > 40) {
            System.out.println("You cannot enter because your age is not appropriate");
        } else if (day != "Wednesday" && (userAge < 20 || userAge > 40)) {
            System.out.println("You cannot enter because your lucky day is  " + day
                    + "and you re not the appropriate age ! ");
        }

    }

}
