package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        File file=new File("success.txt");
        try(Scanner read=new Scanner(file)){
            while(read.hasNextLine()){
                String data=read.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
