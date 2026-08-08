import java.util.*;
public class BreakContinue {
    public static void main(String[] args){
        System.out.println("Example using break: ");
        for(int i=1; i<=5; i++) {
            System.out.println("Iteration " + i);

            if(i==3){
                System.out.println("Breaking");
                break;
            }

            System.out.println("Continue with the rest loop.");
        }

        System.out.println("Example of Continue: ");
        for(int j=1; j<=5; j++){
            System.out.println("Iteration " + j);

            if(j==2 || j==4){
                System.out.println("Skipping this iteration.");
                continue;
            }
            System.out.println("continue with the rest of the loop.");
        }
    }
}
