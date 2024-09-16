package Assigment2;

import java.io.*;
import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input filename
        System.out.print("Enter the input filename: ");
        String inputFilename = scanner.nextLine();

        // Prompt the user to enter the output filename
        System.out.print("Enter the output filename: ");
        String outputFilename = scanner.nextLine();

        // Try to open the input file and output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {

            String line;

            // Read from the input file and write to the output file line by line
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line in the output file
            }

            System.out.println("File copied successfully from " + inputFilename + " to " + outputFilename);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFilename);
        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}

