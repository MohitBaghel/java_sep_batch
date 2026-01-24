package course.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {


    public static void main(String[] args) {
        
        ArrayList<String> bikes = new ArrayList<>(); // initialise a arraylist
        bikes.add("Honda"); 
        bikes.add("Yamaha");
        bikes.add("Suzuki");
        bikes.add("Kawasaki");
        bikes.add("Ducati");
        bikes.add("BMW");

        System.out.println(bikes);

        // System.out.println(bikes.get(15));


        bikes.add(1,"Hero");

        
        bikes.set(2, "TVS");


        System.out.println(bikes);
        Collections.sort(bikes);


        // for(int i = 0;  i< bikes.size(); i++){
        //     System.out.println(bikes.get(i));
        // }


        for(String i : bikes){
            System.out.println(i);
        }

    }


    
}
