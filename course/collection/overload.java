package course.collection;
public class overload {

    public static void main(String[] args) {
        
   
    System.out.println(add(10, 20));
    System.out.println(add(10, 20, 30));
    display();

       
    }


    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
    
        return a + b + c;
    }



    static void display(){
         String name = "javaSession";
        System.out.println("name : "+ name);
    }
}


// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55

