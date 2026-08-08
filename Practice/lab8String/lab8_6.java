//Write a program in java to demonstrate the following stringBuffer functions on the string 
//"Java is my favorite Programming Language"
// a. append()  b. insert()  c. delete()  //d. ensureCapacity()  //e. capactity()  //f. reverse()
package Practice.lab8String;
import java.util.Scanner;

public class lab8_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initializing a StringBuffer object with the user input
        StringBuffer stringBuffer = new StringBuffer(inputString);

        // a. append()
        System.out.print("Enter a string to append: ");
        String stringToAppend = scanner.nextLine();
        stringBuffer.append(stringToAppend);
        System.out.println("a. append() result: " + stringBuffer);

        // b. insert()
        System.out.print("Enter a string to insert: ");
        String stringToInsert = scanner.nextLine();
        System.out.print("   Enter the index to insert at: ");
        int insertIndex = scanner.nextInt();
        stringBuffer.insert(insertIndex, stringToInsert);
        scanner.nextLine(); // Consume the newline character
        System.out.println("b. insert() result: " + stringBuffer);

        // c. delete()
        System.out.print("Enter the start index for delete: ");
        int startIndex = scanner.nextInt();
        System.out.print("   Enter the end index for delete: ");
        int endIndex = scanner.nextInt();
        stringBuffer.delete(startIndex, endIndex);
        scanner.nextLine(); // Consume the newline character
        System.out.println("c. delete() result: " + stringBuffer);

        // d. ensureCapacity()
        System.out.print("Enter the new capacity for ensureCapacity: ");
        int newCapacity = scanner.nextInt();
        stringBuffer.ensureCapacity(newCapacity);
        scanner.nextLine(); // Consume the newline character
        System.out.println("d. ensureCapacity() result: Capacity increased to " + stringBuffer.capacity());

        // e. capacity()
        System.out.println("e. capacity() result: " + stringBuffer.capacity());

        // f. reverse()
        stringBuffer.reverse();
        System.out.println("f. reverse() result: " + stringBuffer);

        scanner.close();
    }
}
