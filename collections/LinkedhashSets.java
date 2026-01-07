package collections;

import java.util.LinkedHashSet;

public class LinkedhashSets {


    // use to store unique elements
    // maintains insertion order -> 

    public static void main(String[] args) {
        
        LinkedHashSet<String> countries = new LinkedHashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("Germany");
        countries.add("France");
        countries.add("India"); // duplicate, will be ignored
        countries.add("USA"); // duplicate, will be ignored

        System.out.println(countries);

        System.out.println(countries.contains("Germany"));

        System.out.println(countries.remove("UK"));

        System.out.println(countries);
        System.out.println(countries);
        System.out.println(countries);

    }
    
}
