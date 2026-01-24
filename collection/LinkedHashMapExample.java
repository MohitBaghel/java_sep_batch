package collection;


import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(2, "Two");

        System.out.println(linkedHashMap);

    }
    
}


// Iterator -> next session