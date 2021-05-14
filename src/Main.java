import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Play the current song");
            System.out.println("Would you like to change the songs? Yes or No");

            String userInput = input.next();

            if (userInput.equals("Yes")) {
                isOnRepeat = false;
            } else {
                System.out.println("Continue enjoying your current song");
            }
        }
        System.out.println("Playing next song");
    }
}
