import java.beans.Statement;

public class forLoop {

    public static void main(String[] args) {
        

        // for(Statement1 ; Statement2 ; Statement3){
        //     // code
        // }



        // for(int i = 1; i <= 3; i++){   // i = 
        //   System.out.println("Outer loop: " + i); // ol 1


        //   // inner loop
        //   for(int j = 1; j <= 3; j++){ // j =3
        //     System.out.println("    Inner loop: " + j); // il = 3
        //   }
        // }

        // System.out.println("For loop ended");



        String [] fruits = { "Apple", "Banana", "Mango", "Orange"};


        for(String fruit : fruits){
              System.out.println(fruit);
        }
      
    }
    
}
