package Practice;
//table of a number given by the user
import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print("2 * "+i);
            System.out.print(" = ");
            System.out.println(2*i);
        }
    }
}
