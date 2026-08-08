//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
package Practice;
import java.util.*;
public class MatrixLocation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter the elements:");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the x: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println("X found at location (" + i +"," + j +")");
                }
            }
        }
        
    }
    
}
