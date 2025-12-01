package collections;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.addFirst("Mango");
        fruits.addLast("Papaya");
        fruits.addLast("Papaya");
        fruits.addLast("Papaya");
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);
        

    }
    
}
