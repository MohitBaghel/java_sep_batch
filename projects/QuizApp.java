package projects;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question[] quiz = new Question[5];

        quiz[0] = new Question("what is the capital of India?",
         "New Delhi", "Mumbai", "Kolkata", "Chennai",
          'a');

          quiz[1] = new Question("who developed Java?",
          "Microsoft", "Apple", "Sun MicroSystems", "Google",
           'c');

           quiz[2] = new Question("which keywors is used to inherit a class in java?",
         "implements", "extends", "super", "this",
          'b');

          quiz[3] = new Question("which collection allows dyanmic size in java?",
         "Array", "String", "Map", "ArrayList",
          'd');


          quiz[4] = new Question("Which is the entry point of java Program?",
         "start()", "run()", "init()", "main()",
          'd');


          int score = 0;
          char answer;


          System.out.println("Welcome to the Quiz App!");

        for(int i=0; i<quiz.length ; i++){
            quiz[i].display();
            System.out.println("Enter your answer (a, b, c, d): ");
            answer =  sc.next().charAt(0);


            if(answer == quiz[i].correctAnswer){
                System.out.println("Correct!");
                score += 2; // score = score + 2;
            } else {
                score -= 1;
                System.out.println("Wrong! The correct answer is: " + quiz[i].correctAnswer);
            }
        }


        System.out.println("\n==========Quiz Finished==========");
        System.out.println("Your Final Score id " + score + " out of " + quiz.length);


        if(score == quiz.length){
            System.out.println("Excellent! You got a perfect score!");
        } else if(score >= quiz.length / 2){
            System.out.println("Good job! You scored above average.");
        } else {
            System.out.println("Better luck next time! Keep practicing.");
        }

        sc.close();
    }
    
}



class Question {

    String ques;
    String option1;
    String option2;
    String option3;
    String option4;
    char correctAnswer;

    public Question(String ques, String option1, String option2, String option3, String option4, char correctAnswer) {
        this.ques = ques;
        this.option1 = option1; 
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
    }

    void display(){
        System.out.println("Ques: " + ques);
        System.out.println("a. " + option1);
        System.out.println("b. " + option2);
        System.out.println("c. " + option3);
        System.out.println("d. " + option4);
    }


    
}

// class Quiz -> ques, options, correctanswer  -> Constructor, void display 