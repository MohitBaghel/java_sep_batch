public class Strings {
    
    public static void main(String[] args) {
        

        String text = "bgfebdhjvbhdfjb";
        String text2 =  "BJHDBFHJBFJVBNJKDFBNVJFBDHVJBDFH";
        System.out.println(text.length());

        // MOHIT -> UPPERCASE
        // mohit -> lowercase


        System.out.println(text.toUpperCase());
        System.out.println(text2.toLowerCase());


        String txt = "Java on session is going on!!";
        System.out.println(txt.indexOf("on"));


        String firstName = "Hello"; //Hello
        System.out.println(firstName.charAt(0)); 
        System.out.println(firstName.charAt(3));
        // System.out.println(firstName.charAt(10));


        String txt3 =   "Hello";
        String txt4 =   "Hello";

        String txt5 =   "Welcome";
        String txt6 =   "     Wel come       ";

        System.out.println(txt3.equals(txt4)); // true
        System.out.println(txt5.equals(txt6)); // false

        System.out.println(txt6.trim()); // true


        String fname = "Hello";
        String lname = "World";
        String txt7 = "Java";

        System.out.println(fname + " " +lname);
        System.out.println(fname.concat(" ").concat(lname).concat(" ").concat(txt7));


        int x =10;
        int y =20;

        int z = x + y;
        System.out.println("The value of z is: " + z);

        String a = "10";
        String b = "20";
        int d = 20;
        String c = a + b;

    System.out.println("The value of c is: " + (d+a));

        







    }
}
