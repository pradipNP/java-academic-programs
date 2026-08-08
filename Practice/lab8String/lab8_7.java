package Practice.lab8String;

public class lab8_7 {
    public static void main(String[] args) {
    
        String str1 = "Hello, World!";
        String str2 = "Java is amazing!";
        String str3 = "Java is amazing!";
        String str4 = "hello";

        // regionMatches()
        boolean regionMatch = str1.regionMatches(0, str2, 0, 5);
        System.out.println("regionMatches(): " + regionMatch);

        // startsWith() and endsWith()
        System.out.println("startsWith(): " + str1.startsWith("Hello"));
        System.out.println("endsWith(): " + str1.endsWith("World!"));

        // compareTo()
        System.out.println("compareTo(): " + str2.compareTo(str3)); 
        System.out.println("compareTo(): " + str1.compareTo(str2)); 

        // indexOf() - all overloaded versions
        System.out.println("indexOf(char): " + str1.indexOf('o')); 
        System.out.println("indexOf(string): " + str1.indexOf("World")); 
        System.out.println("indexOf(char, fromIndex): " + str1.indexOf('o', 5)); 
        System.out.println("indexOf(string, fromIndex): " + str1.indexOf("o", 5)); 
    }
}