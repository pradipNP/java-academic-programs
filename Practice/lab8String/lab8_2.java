package Practice.lab8String;

import java.util.Scanner;

public class lab8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter another string for comparison: ");
        String secondString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        System.out.print("Enter the position for insertion: ");
        int position = scanner.nextInt();

        System.out.print("Enter the string to be inserted: ");
        String insertString = scanner.next();

        System.out.println("1. Change case: " + changeCase(inputString));
        System.out.println("2. Reverse string: " + reverseString(inputString));
        System.out.println("3. Compare strings: " + compareStrings(inputString, secondString));
        System.out.println("4. Insert string: " + insertString(inputString, insertString, position));
        System.out.println("5. Convert case: " + convertCase(inputString));
        System.out.println("6. Find character: " + findCharacter(inputString, inputChar));
        System.out.println("7. Palindrome check: " + isPalindrome(inputString));
        int[] counts = countWordsVowelsConsonants(inputString);
        System.out.println("8. Word count: " + counts[0]);
        System.out.println("   Vowel count: " + counts[1]);
        System.out.println("   Consonant count: " + counts[2]);
    }

    public static String changeCase(String string) {
        return string.toUpperCase();
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String compareStrings(String string1, String string2) {
        if (string1.equals(string2)) {
            return "Strings are equal";
        } else {
            return "Strings are not equal";
        }
    }

    public static String insertString(String mainString, String insertString, int position) {
        return mainString.substring(0, position) + insertString + mainString.substring(position);
    }

    public static String[] convertCase(String string) {
        return new String[]{string.toUpperCase(), string.toLowerCase()};
    }

    public static String findCharacter(String string, char character) {
        if (string.indexOf(character) != -1) {
            return "Character '" + character + "' found at position " + (string.indexOf(character) + 1);
        } else {
            return "Character '" + character + "' not found in the string";
        }
    }

    public static boolean isPalindrome(String string) {
        String reversedString = reverseString(string);
        return string.equals(reversedString);
    }

    public static int[] countWordsVowelsConsonants(String string) {
        int wordCount = string.split("\\s+").length;
        int vowelCount = 0;
        int consonantCount = 0;
        string = string.toLowerCase();
        for (char character : string.toCharArray()) {
            if (Character.isLetter(character)) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        return new int[]{wordCount, vowelCount, consonantCount};
    }
}