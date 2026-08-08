package Marketing;

import General.Employee;

public class Sales extends Employee {

    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double allowance(double totalEarnings) {
        return totalEarnings * 0.05;
    }
}
