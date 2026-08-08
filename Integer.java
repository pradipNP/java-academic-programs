//How to Print an Integer entered by an user

import java.util.Scanner;

public class Integer {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = reader.nextInt();

        System.out.println("You entered: " + number);
    }
}