package course.collection;

import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        
        try {

            TreeMap<Integer, String> map = new TreeMap<>();
            map.put(3, "Three");
            map.put(1, "One");
            map.put(4, "Four");
            map.put(2, "Two");
            System.out.println("TreeMap: " + map);
            

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
