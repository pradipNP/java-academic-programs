package General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double da = basic * 0.8;
        double hra = basic * 0.15;
        return basic + da + hra;
    }
}
