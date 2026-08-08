//Define an abstract class "Staff" with members name and address. 
//Define two subclasses of this class "FullTimeStaff" (department, salary) and 
//"PartTimeStaff" (numberof- hours, rate-per-hour). Define appropriate constructors. 
//Create n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user's choice. 
//Display details of all "FullTimeStaff" objects and all "PartTimeStaff" objects.
package Practice.lab10;
import java.util.Scanner;

abstract class Staff {
    String name;
    String address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of hours: " + numberOfHours);
        System.out.println("Rate per hour: " + ratePerHour);
        System.out.println("Salary: " + (numberOfHours * ratePerHour));
    }
}

public class staffAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects to create: ");
        int n = sc.nextInt();
        Staff[] staff = new Staff[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter 1 for FullTimeStaff and 2 for PartTimeStaff: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter department: ");
                String department = sc.nextLine();
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                staff[i] = new FullTimeStaff(name, address, department, salary);
            } else {
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter number of hours: ");
                int numberOfHours = sc.nextInt();
                System.out.print("Enter rate per hour: ");
                double ratePerHour = sc.nextDouble();
                staff[i] = new PartTimeStaff(name, address, numberOfHours, ratePerHour);
            }
        }
        System.out.println("Details of FullTimeStaff: ");
        for (int i = 0; i < n; i++) {
            if (staff[i] instanceof FullTimeStaff) {
                staff[i].display();
            }
        }
        System.out.println("Details of PartTimeStaff: ");
        for (int i = 0; i < n; i++) {
            if (staff[i] instanceof PartTimeStaff) {
                staff[i].display();
            }
        }
    }
}