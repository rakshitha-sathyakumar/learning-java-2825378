import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double studentGPA = 3.56;
        String studentFirstName = "Rakshitha";
        String studentLastName = "Sathyakumar";
        System.out.println(studentFirstName + " " +
                studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA " + studentGPA); 
    }
}
