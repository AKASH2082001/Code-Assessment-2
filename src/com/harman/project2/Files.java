/*Create a java project and in that , you have to create a file named “data.txt”
and store this data in that file “HAPPY NEW YEAR”. Create a program
to read the data from the file and display the count of  each of VOWELS ( A E I O U )*/

package com.harman.project2;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("data.txt");
            writer.write("HAPPY NEW YEAR");
            writer.close();
            System.out.println("File has successfully created");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
