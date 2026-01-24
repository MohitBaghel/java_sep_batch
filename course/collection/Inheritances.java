package course.collection;
public class Inheritances {

    public static void main(String[] args) {
        Car car1 =  new Car();
        car1.start(); // accessing the method of superclass Vehicle
        car1.honk();  // accessing the method of subclass Car
    }

}


// Superclass
 class Vehicles {
    public void start(){
        System.out.println("Vehicle is starting");
    }
}



// 
class Car extends Vehicles { // used exyend keyword to access the superclass into subclass
        public void honk(){
            System.out.println("Car is honking");
        }
    }

