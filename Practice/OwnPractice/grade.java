//calculate the percentage of of a exam of 5 subjects out of 100 marks.
package Practice.OwnPractice;
import java.util.Scanner;
public class grade {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks of subject 1 :");
    int mark1 = sc.nextInt();
    System.out.print("Enter the marks of subject 2:");
    int mark2 = sc.nextInt();
    System.out.print("Enter the marks of subject 3:");
    int mark3 = sc.nextInt();
    System.out.print("Enter the marks of subject 4:");
    int mark4 = sc.nextInt();
    System.out.print("Enter the marks of subject 5:");
    int mark5 = sc.nextInt();

    int Marks = mark1 + mark2 + mark3 + mark4 + mark4 + mark5;
    int MaximumMarks = 5 * 100;
    float percentage = (float)(Marks / MaximumMarks) * 100;
    System.out.println("The percentage he got is:" + percentage);
  }
}
