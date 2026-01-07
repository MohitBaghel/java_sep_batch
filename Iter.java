import java.util.ArrayList;
import java.util.Iterator;

public class Iter {

    public static void main(String[] args) {
        
        ArrayList < String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");

        Iterator<String> it = animals.iterator();
        System.out.println(it);
    }
}

