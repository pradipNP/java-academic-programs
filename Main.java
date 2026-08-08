import Marketing.Sales;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int empid = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        String ename = scanner.nextLine();

        System.out.println("Enter the basic salary");
        double basicSalary = scanner.nextDouble();

        Sales sales = new Sales(empid, ename);
        double totalEarnings = sales.earnings(basicSalary);
        double travelAllowance = sales.allowance(totalEarnings);

        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarnings);
        // Uncomment the line below to print travel allowance (optional)
        // System.out.println("The travel allowance is " + travelAllowance);
    }
}
