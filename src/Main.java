import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the value of (2+3)?";
        String choiceOne = "one";
        String choiceTwo = "five";
        String choiceThree = "three";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Pick the correct choice from the following answers");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer

        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input

        String userInput = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userInput.toLowerCase().equals(correctAnswer)) {
            System.out.println("Congrats your answer is correct");
        } else {
            System.out.println("Incorrect!! The correct answer is " + correctAnswer);
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
