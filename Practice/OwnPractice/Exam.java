package Practice;
import java.util.*;

public class Exam{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get marks for each subject
    System.out.println("Enter the marks for five subjects (out of 100):");
    int subject1 = scanner.nextInt();
    int subject2 = scanner.nextInt();
    int subject3 = scanner.nextInt();
    int subject4 = scanner.nextInt();
    int subject5 = scanner.nextInt();

    int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
    int maximumMarks = 5 * 100;

    float percentage = (float) totalMarks / maximumMarks * 100;

    System.out.println("The overall percentage obtained in the exam is: " + percentage + "%");
  }
}
