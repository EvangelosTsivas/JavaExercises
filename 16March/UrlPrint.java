package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UrlPrint {

    public static void main(String[] args) throws IOException {
        String nameOfFile = "/Users/Vagos/Documents/url.txt";
        File file = new File(nameOfFile);
        printSubdomain(file);
        System.out.println("************");
        printJava(file);

    }

    public static void printSubdomain(File file) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        System.out.println(line.substring(line.indexOf("j"), line.indexOf(".c")));
        line = reader.readLine();
        System.out.println(line.substring(line.indexOf("d"), line.indexOf(".c")));
        line = reader.readLine();
        System.out.println(line.substring(line.indexOf("b"), line.indexOf(".c")));
        line = reader.readLine();
        System.out.println(line.substring(line.indexOf("v"), line.indexOf(".c")));
        line = reader.readLine();
        System.out.println(line.substring(line.indexOf("tu"), line.indexOf(".c")));

        reader.close();
        fileReader.close();
    }

    public static void printJava(File file) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            if (line.contains("java")) {
                System.out.println(line);
            }
            line = reader.readLine();
        }
        reader.close();
        fileReader.close();

    }

}
