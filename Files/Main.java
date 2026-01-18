package Files;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        try(FileInputStream file=new FileInputStream("success.txt")){
            int i;
            while((i=file.read())!=-1){
                System.out.println((char)i);
            }
        }catch(IOException e){
                System.out.println("Error reading file");
                e.printStackTrace();
            }
        
    }
    
}
