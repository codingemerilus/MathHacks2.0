
import java.util.Scanner;

public class BudgetingProgram {

    public static void main(String[] args) {
        Savings();
    }

    public static void Savings() {

        Scanner input = new Scanner(System.in);

        System.out.println("What are you saving for?");
        System.out.println("1. Education");
        System.out.println("2. Car");
        System.out.println("3. Trip / Vacation");
        System.out.println("4. Specific Item");
        System.out.println("5. Back to Main Menu");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Education Savings");
                break;

            case 2:
                System.out.println("Car Savings");
                break;

            case 3:
                System.out.println("Trip / Vacation Savings");
                break;

            case 4:
                System.out.println("Specific Item Savings");
                break;

            case 5:
                System.out.println("Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}


        