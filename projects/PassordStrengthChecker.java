package projects;

import java.util.Scanner;


// minor project -1
public class PassordStrengthChecker {


    public static void main(String[] args) {
        enterPassword();
    }


    static  void enterPassword(){
        System.out.println("Enter your password: ");
        // logic to check password strength

        // user input
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();


        int strength = checkStrength(pass);
        System.out.println("Password strength score: " + strength + " out of 5");

        }
        
        
            private static int checkStrength(String pass) {
                int score = 0;


                if(pass.length() >=8){
                    score++;
                }

                boolean hasUpper = false;
                boolean hasLower = false;
                boolean hasDigit = false;
                boolean hasSpecial = false;

// fvdhuqwudashfg4iq
                for(char ch : pass.toCharArray()){
                        if(java.lang.Character.isUpperCase(ch)){
                            hasUpper = true;
                        } else if(java.lang.Character.isLowerCase(ch)){
                            hasLower = true;
                        } else if(java.lang.Character.isDigit(ch)){
                            hasDigit = true;
                        } else {
                            hasSpecial = true;
                        }
                }


                if(hasUpper) score++;
                if(hasLower) score++;
                if(hasDigit) score++;
                if(hasSpecial) score++;


            return  score;
            }
    
}
