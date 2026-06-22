package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo {

    static ArrayList<Task> tasklist = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

       int choice; 

       do { 

        
           
       } while (true);

    }
    
}



class Task {

    String title;
    boolean isTaskComplete;

    public Task(String title){
      this.title = title;
      this.isTaskComplete = false;
    }


    void display(int index){
     String status = isTaskComplete ? "Complete" : "[Pending]";
     System.out.println((index + 1) + ". " + title + " - " + status);
    }
}


// task -> title -> boolean isTaskComplete
// constructor -> title, isTaskComplete
// void class to display