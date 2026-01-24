package course.collection;
public class operator { 

    public static void main(String[] args) {
       
        // Arithmetic Operators : +, -, *, /, %
        // Assignment Operators : =, +=, -=, *=, /=, %=
        // Comparison Operators : ==, !=, >, <, >=, <=
        // Logical Operators : &&, ||, !

        // 10 + 20 = 30

        int a = 10;
        int b = 20;
       
    

        // System.out.println("a + b =" +(a + b)); // 30
        // System.out.println("a - b =" +(a - b)); // -10
        // System.out.println("a * b =" +(a * b));// 200
        // System.out.println("a / b =" +(a / b));// 0, 
        // System.out.println("a % b =" +(a % b));// 10


    //     int c = 35; //=
    //     c +=5 ; // c = c + 5;
    //    // c -=5 ;// c = c -5;


    //     System.out.println("c value: " + c);



    // int x = 10;
    // int y = 20;

    // System.out.println(x > y); // false // 10 > 20
    // System.out.println(x < y); // true
    // System.out.println(x <= y); // false
    // System.out.println(x != y); 


    //&& -> And -> both value must be true  x<2 && x>5 
    // || -> Or -> any one value is true
    // ! -> Not -> reverses the value


    boolean isSession = true;
    boolean isBreak = false;


    System.out.println(isSession && isBreak);  // true && false -> false // true && true -> true;
    System.out.println(isSession || isBreak); // true && false -> true // false || false -> false
    System.out.println(!isSession); // !true -> false // !false -> true

      
    }
    
}
