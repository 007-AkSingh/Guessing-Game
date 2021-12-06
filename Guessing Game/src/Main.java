
/* Java game “Guess a Number” that allows user to guess a random number that has been generated.
*/
import javax.swing.*;  // Swing package is used to create windows based api, * is use to import all libraries in swim
 
public class Main {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1); // initialize the computer(random) number 
        int userAnswer = 0; //declare users answer
        System.out.println("The correct guess would be " + computerNumber);  // print 
        int count = 1;  // initialize count variable for number of chances 

        while (userAnswer != computerNumber)  // condition for wrong input
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);  // to pop a dialog box containing gui of guessing game
            userAnswer = Integer.parseInt(response);  // parse used to convert integer
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));  // to pop dialog box that prompts user for values or informs hint to guess
            count++;  //increment after every chance i.e. users guess
        }  
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {  // condition for wrong answer i.e. guess should be between 0-100 
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){  // condition for right answer
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {  // condition for answer greater than computer number  
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {// condition for answer smaller than computer number  
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else { // condition for incorrect answer
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}