package collections;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        
        HashMap<String, String> hs =  new HashMap<>();
        hs.put("name", "John");
        hs.put("age", "30");
        hs.put("city", "New York");
        hs.put("name", "Jonny"); // duplicate key, will update the value

        System.out.println("Name: " + hs.get("name"));
        System.out.println( hs.remove("name"));

       hs.clear();

        

       
        System.out.println(hs);
    }
    
}
