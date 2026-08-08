//Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
//Input: Enter the numbers -Example: 12345 (Suppose array size is 4)
//Output: Exception in thread "main"java.lang.ArrayIndexOutOfBoundsException:4
package Practice;
import java.util.Scanner;
public class ArrayIndexException {
    public static void main(String[] args){
        
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = numbers.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in array:");
        for(int i=0; i<=n; i++){
           array[i]=numbers.nextInt();
        }
        //System.out.println("Array elements are: ");
        // for(int i=0; i<n; i++){
        // System.out.println(array[i]);
        // }
        try{
            System.out.println("Element at index 4: " + array[0]);
        }

        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Exception in thread :" + a);
        }
    }
}
