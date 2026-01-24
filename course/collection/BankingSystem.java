package course.collection;
public class BankingSystem {

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.startAccount(1000001, "Kavadi", 0);
       b1.Desposit(20000);
       b1.withdraw(5000);
       b1.Desposit(10000);
       b1.withdraw(40000);
       b1.Enquiry();
        


       Bank b2 = new Bank();
        b2.startAccount(1000002, "Uday", 50000);
        b2.Desposit(100000);
        b2.withdraw(35000);

        b2.Enquiry();
       

    }
    
}




  protected class Bank{

    int account_number;
    String name;
    int balance;


   void  startAccount(int account_number, String name, int balance){
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;

    }


    void Desposit(int amount){
        balance = balance + amount;
    

    }


    void withdraw(int amount){
        if(balance >= amount){
                balance = balance - amount;
               
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    void Enquiry(){

        System.out.println("Account Number: " + account_number);
        System.out.println("Name : " + name);
        System.out.println("Balance: " + balance);

    }




}
