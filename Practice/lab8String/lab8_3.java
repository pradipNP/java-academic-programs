package Practice.lab8String;
//Write a program to create user defined exceptions called HrsException, MinException and SecException. 
//Create a class Time which contains data members hours, minutes, seconds and a method to take a 
//time from user which throws the user defined exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).

import java.util.Scanner;

public class lab8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter hours:");
            int hours = scanner.nextInt();
            System.out.println("Enter minutes:");
            int minutes = scanner.nextInt();
            System.out.println("Enter seconds:");
            int seconds = scanner.nextInt();
            Time time = new Time(hours, minutes, seconds);
            System.out.println("Time: " + time);
        } catch (HrsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours value");
        }
        this.hours = hours;

        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes value");
        }
        this.minutes = minutes;

        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds value");
        }
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}