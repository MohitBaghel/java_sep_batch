package course.collection;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
    
    public static void main(String[] args) {

        try {
            FileInputStream fis = new  FileInputStream("/Users/perennial/Desktop/download.jpeg");
            FileOutputStream fos = new FileOutputStream("/Users/perennial/Desktop/download_copy.jpeg");
            int a;

            while((a = fis.read()) != -1){
                fos.write(a); // write byte by byte
            }


        } catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        
    
    }
}
