package faily;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }
    
}
