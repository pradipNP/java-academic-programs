package Practice;
import java.util.*;
public class marks {
    public static void main(String[] args){
        System.out.println("Menu :");
        System.out.println("0: Exit");
        System.out.println("1: Enter the marks");
        System.out.println("Enter your choice 0 or 1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num){
            case 0: System.out.println("click 1");
            break;
            case 1: printmarks(sc);
            break;
            default : System.out.println("Invalid number");
        }
  }
  private static void printmarks(Scanner sc){ 
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the mark: ");
    int marks = sc1.nextInt();

    
            if(marks<=59){
                System.out.println("This is good as well");
            }
            else if(marks<=89) {
                System.out.println("This is also good");
            }
            else{
                System.out.println("This is good");
            }
        
  }
}
 
    

