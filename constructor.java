import java.util.Scanner;

class Student {
    
    private String name;
    private int age;

    
    public Student() {
        System.out.println("Default Constructor: Object created without parameters.");
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Object created with parameters.");
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student("Pradeep Kumar", 21); 

        
        System.out.println("\nStudent 1 Information:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
}
