package Files;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args){
        try(FileInputStream file = new FileInputStream("download.jpg");
            FileOutputStream file2 =new FileOutputStream("copy.jpg")){
                int i;
                while((i=file.read())!=-1){
                    file2.write(i);
                }
                System.out.println("File copied successfully");
            }catch(IOException e){
                System.out.println("An error occured");
                e.printStackTrace();
            }
    }
    
}
