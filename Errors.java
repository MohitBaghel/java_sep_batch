public class Errors {

    public static void main(String[] args) {
        System.out.println("hello world"); // compile time error if semicolon is missing

        // int x = 5;
        // int y = 0;
        // int result = x / y; // runtime error: division by zero  
        // System.out.println("Result: " + result);


        int a = 10;
        int b = 20;
        int sum = a - b; // logical error: should be addition
        System.out.println("Sum: " + sum);
    }
}


/* types of Error:

1. compile time error -> error occur during compilation or compile time
2. Runtime error -> error occur during execution or runtime
3. Logical error -> error in logic that produces incorrect result
*/
