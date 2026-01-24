package collection;

import java.util.*;

public class Sets {

    public static void main(String[] args) {


        TreeSet<String> cars = new TreeSet<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("Tata"); // duplicate, will be ignored
        cars.add("Ford");
        cars.add("Ford");
         cars.add("Ford");

         cars.remove("Ford");
        

        // HashSet<String> cars = new HashSet<>();
        // cars.add("BMW");
        // cars.add("Audi");
        // cars.add("Ford");
        // cars.add("Mercedes");
        // cars.add("Tata"); // duplicate, will be ignored
        // cars.add("Ford");
        // cars.add("Ford");
        //  cars.add("Ford");

        //  cars.remove("Ford");


         System.out.println(cars.contains("Porsche"));

        System.out.println(cars);

    }
    
}



// linkedHashSet -> next session