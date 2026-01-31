package projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   

    //Project -3
public static void main(String[] args) {
    


    Scanner sc = new Scanner(System.in); // user input
    Random random = new Random();
    int randomNum = random.nextInt(100) + 1; // 

    int guess = 0;
    int attempts = 0;


    System.out.println("Welcome to the Number Guessing Game!");
    System.err.println("Guess a number between 1 and 100:");


    while(guess != randomNum){
        System.err.println("Enter your guess: ");
        guess = sc.nextInt();
       

        if(guess > randomNum){ //  76 >  65
            System.out.println("Too high! Try again.");
        } else if (guess <  randomNum){ // 64 < 65
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Congratulations! You guessed the number " + randomNum + " in " + attempts + " attempts.");
        }

        attempts++;

    }

    sc.close();



    
}
}
