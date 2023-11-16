package org.example;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/example/PRECIP_HLY_sample_csv.csv"));
            String line = reader.readLine();
            while (line != null) {
                myList.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(myList);
    }
}