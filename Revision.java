public class Revision {

    public static void main(String[] args) {
        // int x = 10;
        // int y = 20;
        // int result = x + y;

        // int a =40;
        // int b = 20;
        // int result1 = a + b ;
        // System.out.println("The sum is: " + result);
        // System.out.println("The sum is: " + result1);
    
        add(10,20);
        add(40,50);
        getName();
    }

    static  void add ( int a, int b ){
        int result = a + b;
        System.out.println("The sum is: " + result);
    }
    

    static void getName(){
        System.out.println("Java Session");
    }
}
