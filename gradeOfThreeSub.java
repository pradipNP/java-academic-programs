import java.util.*;
public class gradeOfThreeSub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark of subject 1: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter the mark of subject 2 : ");
        int sub2 = sc.nextInt();

        System.out.println("Enter the mark of subject 3 : ");
        int sub3 = sc.nextInt();

        double average = (sub1 + sub2 + sub3/3.0);

        char grade;
        if(average >= 90) {
            grade = 'A';
        }
        else if(average >= 80){
            grade = 'B';
        }
        else if(average >= 70){
            grade = 'C';
        }
        else if(average >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        

    }
}
