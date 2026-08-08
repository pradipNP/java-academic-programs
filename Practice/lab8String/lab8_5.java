//Write a program in java to demonstrate the following String functions on any example string using String class
//a. join() b. isEmpty()   c. replace()   d. split()  e. subString()
package Practice.lab8String;

public class lab8_5 {
    public static void main(String[] args) {
        // Example string
        String exampleString = "Hello World! This is an example string.";

        // a. join()
        String[] words = {"Hello", "World", "Java"};
        String joinedString = String.join(" ", words);
        System.out.println("a. join() result: " + joinedString);

        // b. isEmpty()
        System.out.println("b. isEmpty() result for exampleString: " + exampleString.isEmpty());

        // c. replace()
        String replacedString = exampleString.replace("Hello", "Hi");
        System.out.println("c. replace() result: " + replacedString);

        // d. split()
        String[] splitStrings = exampleString.split(" ");
        System.out.println("d. split() result:");
        for (String str : splitStrings) {
            System.out.println("   - " + str);
        }

        // e. subString()
        String subStr = exampleString.substring(6, 11);
        System.out.println("e. subString() result: " + subStr);
    }
}
