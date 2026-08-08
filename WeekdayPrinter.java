import java.util.Scanner;

public class WeekdayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number of the current month: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 31) {
            System.out.println("Invalid day number. Please enter a number between 1 and 31.");
            return; 
        }

       
        int weekday = (dayNumber - 1) % 7 + 1;

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error: Invalid weekday");
                break;
        }

        scanner.close();
    }
}
