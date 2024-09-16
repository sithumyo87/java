package Assigment2;

import java.io.*;
import java.util.Scanner;

public class No6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the filename
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // Try to open the file and read its contents
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // Read and print each line from the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            // Close the file scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
