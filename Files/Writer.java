package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("success.txt"))) {

            bw.write("bro we dont have time !");
            bw.newLine();
            bw.write("so lets start now and win tomorrow");

            System.out.println("Successfully wrote to the file ✅");

        } catch (IOException e) {
            System.out.println("Error occurred ");
            e.printStackTrace();
        }
    }
}
