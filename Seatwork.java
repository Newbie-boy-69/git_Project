
import java.util.Scanner;

public class Seatwork {
    public static void main(String[] args) {

        String x;
        String y;
        String z;
        String s;

        Scanner scan = new Scanner(System.in);
        System.out.print("Your Name: ");
        x = scan.nextLine();
        System.out.println("You are: " + x);

        System.out.print("Your course: ");
        y = scan.nextLine();

        System.out.print("Your grade: ");
        z = scan.nextLine();
        int grade = Integer.parseInt(z);

        if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 85) {
            System.out.println("Very Good!");
        } else if (grade >= 80) {
            System.out.println("Good!");
        } else if (grade >= 75) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
        System.out.println("1 - Java Programming");
        System.out.println("2 - Database Management");
        System.out.println("3 - Web Development");
        System.out.println("4 - Networking");
        System.out.print("Choose your schedule option: ");
        s = scan.nextLine();

        switch (s) {
            case "1":
                System.out.println("You choose Java Programming");
                break;
            case "2":
                System.out.println("You choose Database Management");
                break;
            case "3":
                System.out.println("You choose Web Development");
                break;
            case "4":
                System.out.println("You choose Networking");
                break;
            default:
                System.out.println("Invalid schedule option.");
                break;
        }
    }
}
