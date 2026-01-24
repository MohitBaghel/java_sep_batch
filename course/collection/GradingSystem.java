package course.collection;
public class GradingSystem {

    public static void main(String[] args) {

        Student s1 = new Student();  // className objectName = new className();
        s1.addmission(1, "Sumit");
        s1.setMarks(83);
        s1.grade();
        s1.markSheet();
        System.out.println("---------------");

        Student s2 = new Student();  // className objectName = new className();
        s2.addmission(2, "Ajay");
        s2.setMarks(33);
        s2.grade();
        s2.markSheet();
        System.out.println("---------------");

        Student s3 = new Student();  // className objectName = new className();
        s3.addmission(3, "Anni Reddy");
        s3.setMarks(99);
        s3.grade();
        s3.markSheet();
        System.out.println("---------------");



    }


    
}



class Student {

    int rollno; // number 
    String name ;
    int marks;
    char grade;



    void addmission(int roll_no, String nm){
        rollno = roll_no;
        name = nm;

    }



    void setMarks(int m){
        marks = m;
    }


    void grade(){
        if(marks >= 90){
            grade = 'A';
        }
        else if(marks >= 80){
            grade = 'B';
        }
        else if(marks >= 70){
            grade = 'C';
        }
        else if(marks >= 60){
            grade = 'D';
        }else if(marks >= 50){
            grade = 'E';
        }
        else{
            grade = 'F';
        }
    }


    void markSheet(){
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
