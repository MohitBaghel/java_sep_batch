package projects;


import java.util.ArrayList;
import java.util.Scanner;


//project -4
public class EmployeeManagementSystem {

    static ArrayList<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        
        do { 
            System.out.println("\n\n");
            System.out.println("***** Employee Management System *****");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees Details");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee Details");
            System.out.println("5. Update Employee Details");
            System.out.println("6. Exit");
            System.out.println("\n\n");

                choice = sc.nextInt();


                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case  2: 
                        viewEmployee();
                         break;
                    case  3: 
                        searchEmployee();
                        break;
                    case  4: 
                        deleteEmployee();
                        break;
                    case  5: 
                        updateEmployee();
                        break;
                    case  6: 
                        System.out.println("Exiting the program. Thank you!");
                    break;
                    default:
                       System.out.println("Invalid choice. Please try again.");
                }

        } while (choice != 6);

        sc.close();

    }


    static void addEmployee(){
        System.out.println("Enter Employee Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter  Name: ");
        String name = sc.nextLine();

        System.out.println("Enter  Department: ");
        String department = sc.nextLine();

        System.out.println("Enter  Salary: ");
        Double salary = sc.nextDouble();


        employeeList.add(new Employee(id, name, department, salary));
        System.out.println("Employee added successfully!");
    }


    static void viewEmployee(){

        if(employeeList.isEmpty()){
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Details:");
            for( Employee emp : employeeList){
                emp.display();
            }
         }
        }


        static void searchEmployee(){
            System.out.println("Enter Employee ID :");

            int id = sc.nextInt();

            for(Employee emp : employeeList){
                if(emp.id == id){
                    emp.display();
                    return;
                }
            }
            System.err.println("Employee with ID " + id + " not found.");
        }



        static void deleteEmployee(){

        System.out.println("Enter Employee ID to delete: ");
        int id =  sc.nextInt();

        for(Employee emp : employeeList){
            if(emp.id == id){
                employeeList.remove(emp);
                System.out.println("Employee with ID " + id + " deleted successfully.");
                return;
            }
        }

        System.out.println("No Employee Found");

        }


        static void updateEmployee(){
                System.out.println("Employee ID to update: ");
                int id = sc.nextInt();

                for(Employee emp: employeeList){
                    if(emp.id == id){
                        System.out.println("Enter new Name: ");
                        emp.name = sc.nextLine();


                        System.out.println("Enter new Dept: ");
                        emp.department = sc.nextLine();

                        System.out.println("Enter new Salary: ");
                        emp.salary = sc.nextDouble();

                        System.out.println(" Employee details updated successfully!");
                        return;

                    }
                }

                System.out.println("No Employee Found");
        }
       
    }



    class Employee{
        int id ;
        String name;
        String department;
        double salary;

        Employee(int id , String name, String department, double salary){
           this.id = id;
           this.name = name;
           this.department = department;
           this.salary = salary;
        }



        void display(){
            System.out.println("Employee ID: " + id +
             ", Name: " + name +
              ", Department: " + department + ", Salary: " + salary);
        
    }
    
}
    



// you need to udate the Employee: id must not be updated
// add new Employee : id must be auto incremented



 /*
       Details Managed by Company:

       1. Employee ID
       2. Name
       3. Department
       4. Salary
       5. Designation
      */ 


       /*
       Common Features::
       1. Add Employee
       2. View All Employees Details
       3. Search Employee by ID
       4. Update Employee Details
       5. Delete Employee
       6.Exit -> Terminate the program
    


        */


       // Important :   oops, data structures -> ArrayList, 
