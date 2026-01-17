package Files;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
            FileWriter file=new FileWriter("success.txt");
            file.write("we will succeed bro ");
            file.close();
            System.out.println("File written successfully");

        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
