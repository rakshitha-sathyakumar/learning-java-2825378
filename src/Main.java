import java.util.Scanner;
public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a word and press return to start the developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
