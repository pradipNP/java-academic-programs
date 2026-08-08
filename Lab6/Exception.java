package Lab6;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the second integer (y): ");
        int y = scanner.nextInt();

        try { 
            //Performing division
            double result =  x/y;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
