package course.collection;
public class inner {
public static void main(String[] args) {
    Outer outer = new Outer(); 
    Outer.Inner inner = new Outer().new Inner(); // initialize inner class
    System.out.println(outer.x + inner.y);
}


    
}




class Outer{
    int x = 10;


    class Inner{
        int  y = 20;
    }
}
