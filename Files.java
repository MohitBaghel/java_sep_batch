import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {

        File fl = new File("/Users/perennial/Desktop/Java_Sep_Batch.txt");
        try {
            //create
            // if(fl.createNewFile()){
            //     System.out.println("File created: " + fl.getName());
            // } else {
            //     System.out.println("File already exists.");
            // }

            // write
            FileWriter fw = new FileWriter("/Users/perennial/Desktop/Java_Sep_Batch.txt", true);
            // fw.write("this is my first file handling program in java");
            fw.write("\n Hello world!");
            fw.close();
            System.out.println("Successfully wrote to the file.");


    

            // read
            // Scanner sc = new Scanner(fl);

            // while (sc.hasNextLine()) {
            //     String data = sc.nextLine();
            //     System.out.println(data);
            // }


            // delete 
        // if(fl.delete()){
        //     System.out.println("Deleted the file: " + fl.getName());
        // } else {
        //     System.out.println("Failed to delete the file.");
        // }
        
    } catch(Exception e){
        System.out.println("Error: " + e.getMessage());
        

    }


        
    }
    
}
