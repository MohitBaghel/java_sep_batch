public class methods {

    public static void main(String[] args) {
        
        // int num [] = {10, 20, 30, 40, 50 }; 

        // add(num); // argument
        // javaSession();


        attendence("Mohit");
        attendence("Uday");
        attendence("kavadi");
        attendence("asritha");
        attendence("yalla");
        attendence("yamini");
        System.out.println("Name : "+getName());

       
    }

    public static void attendence(String name){
        System.out.println("Present : " + name);
    }

    public static String getName(){

        return "javaSession";
       
    }



    // static void add(int [] num){ // parameter

    //     int sum  = 0;


    //     for( int i =0 ; i< num.length; i++){
    //         sum += num[i];
    //     }


    //     System.out.println("The sum is: " + sum);
    //     System.out.println();

    // }



    // public static void javaSession(){
    //     System.out.println("This is javaSession method");
    // }

    
}
