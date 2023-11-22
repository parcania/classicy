package org.Lohen;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); //create an array to add info from the CSV to
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/Lohen/030750.csv"));
            String line = reader.readLine();
            while (line != null) {                       //as long as there is still content
                myList.add(line);                       //add content to arraylist myList
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}