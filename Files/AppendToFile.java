package Files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args){
        try(FileWriter file = new FileWriter("success.txt",true)){
            file.write("yes must and should" + System.lineSeparator());
            System.out.println("file append successfully");

        }catch(IOException e){            
            e.printStackTrace();
        }

        // Verification: Read and print the file content
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("success.txt"))) {
            System.out.println("\n--- File Content Verification ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading verification file.");
            e.printStackTrace();
        }
    }
    
    
}
