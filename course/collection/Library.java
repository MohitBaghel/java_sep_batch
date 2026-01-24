package course.collection;
public class Library {

    public static void main(String[] args) {

        try {

    
        // create new object
        LibrarySystem book1 = new LibrarySystem();
        book1.addBook(1,"DP) Dynamic programming", 1500);
        book1.IssueBook();
        book1.submitBook();


        LibrarySystem book2 = new LibrarySystem();
        book2.addBook(1,"Java fundamental", 1800);
        book2.IssueBook();
        book2.submitBook();

        } catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    
}




  class LibrarySystem{
    int book_id;
    String book_name;
    int price;
     boolean status;


     void addBook(int book_id, String book_name, int price){
        this.book_id = book_id;
        this.book_name = book_name;
        this.price = price;
        this.status = true; // available
     }



     void IssueBook(){

        if(status == true){
            status = false;
            System.out.println("Book Issued Successfully");
        } else{
             System.out.println("Book is not available" );
        }
     }


     void submitBook(){
        if(status == false){
            status = true;
            System.out.println("Book Submitted Successfully");
        } else {
            System.out.println("Book is already available in library");
        }
     }
    

}