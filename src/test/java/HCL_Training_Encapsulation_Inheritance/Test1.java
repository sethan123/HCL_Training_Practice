//Build a base class Employee and class Engineer is a derived class that extends the Employee class
//In Class Employee declare salary of employee and in Class Engineer declare benefits of employee
//Create class Test as a driver class to run the program.


package HCL_Training_Encapsulation_Inheritance;
class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
}

class Engineer extends Employee {
    private double benefits;

    public Engineer(double salary, double benefits) {
        super(salary);
        this.benefits = benefits;
    }

    public double getBenefits() {
        return benefits;
    }
}
public class Test1 {
	public static void main(String[] args) {
        Engineer engineer = new Engineer(60000, 10000);
        System.out.println("Salary: " + engineer.salary);
        System.out.println("Benefits: " + engineer.getBenefits());
    }
}
