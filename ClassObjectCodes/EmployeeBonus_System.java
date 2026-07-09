
class Employee {
    // Private variables (Encapsulation)
    private String employeeName;
    private double salary;
    private int yearsOfService;

    // Setter methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    // Calculate final salary with bonus
    public double getFinalSalary() {
        double bonus;

        if (yearsOfService >= 10) {
            bonus = salary * 0.20;
        } else if (yearsOfService >= 5) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        return salary + bonus;
    }
}

public class EmployeeBonus_System {
    public static void main(String[] args) {

        // Object creation
        Employee emp = new Employee();

        // Setting values
        emp.setEmployeeName("Khushi");
        emp.setSalary(50000);
        emp.setYearsOfService(6);

        // Display output
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Final Salary with Bonus: " + emp.getFinalSalary());
    }
}