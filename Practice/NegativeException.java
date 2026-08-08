//Write a Java class which has a method called ProcessInput(). 
//This method checks the number entered by the user. 
//If the entered number is negative then throw an user defined exception called NegativeNumberException, 
//otherwise it displays the double value of the entered number.


package Practice;
import java.util.Scanner;

class Process {
    public void ProcessInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = scanner.nextInt();
            if (num < 0) {
                throw new NegativeArraySizeException("number should be positive");
            } else {
                System.out.println("Double value: " + num * 2.0);
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        } finally {
            scanner.close(); // Close the Scanner to avoid resource leaks
        }
    }
}

public class NegativeException {
    public static void main(String[] args) {
        Process process = new Process();
        process.ProcessInput();
    }
}

