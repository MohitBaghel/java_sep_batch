public class Oops { 

    int id;
    String name ;


    public Oops(){
        // default constructor
    }


    public Oops(int id, String name){
                this.id = id;
                this.name = name;


        // System.out.println("Parameterized constructor");
        // System.out.println(a + b);
    }


    public static void main(String[] args) {
        
    
            Oops obj = new Oops(); // new object
            System.out.println(obj.x);
            myrun();
    }


     static void myrun(){
        System.out.println("My run method");
    }


    public int add(int a, int b){
        return a + b;
    }
    
}

// this -
//final, static , Abstract