package course.collection;
 class Abstraction {  
    public static void main(String[] args) {
        
      
    
}


abstract class Cars{
    abstract void start();
    abstract void stop();   
}



class Bmw extends Cars{
    void start(){
        System.out.println("BMW started");
    }

    void stop(){
        System.out.println("BMW stopped");
    }
}


 }


interface Bikes {
  void run();
  void speed();
    
 }


class Honda implements Bikes{
    public void run(){
        System.out.println("Honda is running");
    }

    public void speed(){
        System.out.println("Honda speed is 100km/h");
    }
}