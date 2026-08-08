package Practice;
import java.util.*;
public class greatersmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println("a is greater than b");
        }
        else if(a<b) {
            System.out.println("b is greater than c");
        }
        else{
            System.out.println("They are equal");
        }
    }
}
