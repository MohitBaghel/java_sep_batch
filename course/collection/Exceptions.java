package course.collection;
public class Exceptions {

    public static void main(String[] args) {
        
        // try {

        //     int a = 10;
        //     int b = 0;
        //     int sum = a- b; // logical error: should be addition
        //     System.out.println("Sum: " + sum);
        //     // block of code here
        // } catch (Exception e) {
        //     // handle exception here
        //     System.out.println("An error occurred: " + e.getMessage());
            
        // } finally{
        //     System.out.println("Execution completed.");
        // }



        try {

            // int [] numss = {1,2,3,4};
            // System.out.println(numss[6]);
            int x = 5;
            int y = 0;
            int result = x / y; // runtime error: division by zero  
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // handle exception here
            System.out.println("An error occurred: " + e.getMessage());
            
        } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
         finally{
            System.out.println("Execution completed.");
            
        }
    }
    
}
