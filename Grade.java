//Write a program to print the corresponding grade for the given 	mark using if..else statement in Java
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        scanner.close();
        char grade;

        if (mark >= 90) {
            grade = 'A';
        } else if (mark >= 80) {
            grade = 'B';
        } else if (mark >= 70) {
            grade = 'C';
        } else if (mark >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("The corresponding grade is: " + grade);
    }
}
