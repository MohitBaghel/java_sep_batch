public class Cars extends Vehicle{


    private String modelName = "G-10";   // Car attribute
    public static void main(String[] args) {
     Cars car = new Cars();
     car.honk();

    }


    
}


 class Vehicle {
    protected String brand = "Mercedes";  // Vehicle attribute
    public void honk() {                // Vehicle method
        System.out.println("umm, ummm!");
    }
}

  
