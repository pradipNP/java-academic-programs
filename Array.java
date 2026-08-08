//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("X found at index: " + i);
            }
            
        }
    }
}
