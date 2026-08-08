package Practice;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b= sc.nextInt();

        try{
            int result = a/b; //c=10/0
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e);
        }

       // System.out.println("We can divide only b/a for c. So,");
        //int result =b/a;
        //System.out.println("The value of c by divinding b by a is : " + result);
    }
}
