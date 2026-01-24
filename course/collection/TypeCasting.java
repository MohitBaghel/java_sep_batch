package course.collection;
public class TypeCasting {

    public static void main(String[] args) {
        int num = 9;
        double d = num;


        double d1 = 4.90;
        int num1 = (int) d1;
        System.out.println("Double value: " + d1);

        System.out.println("Double value: " + num1);



        // System.out.println("Integer value: " + num);
        // System.out.println(d);


        // next session -> Strings

        // Type casting -> converting one data type to another data type
        // 1. Widening Casting() -> automatic type conversion -> smaller to larger data type
            //byte -> short -> int -> long -> float -> double
        // 2. Narrowing Casting() -> manual type conversion -> larger to smaller data type
            // double -> float -> long -> int -> short -> byte    

    }
}