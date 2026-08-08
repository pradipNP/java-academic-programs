package Practice;
// Print if a number is prime or not (Input n from the user).
import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(int i=2; i<=num; i++){
            if (i<=1){  
                System.out.println("false");
            }            
        }
    }
    
}
