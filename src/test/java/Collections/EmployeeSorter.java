//Create 5 Employee(id, name , salary) objects , store them in Array List.
//get their names and sort their names and print on console
//
// 
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

       
        employees.add(new Employee(1, "John", 5000.0));
        employees.add(new Employee(2, "Alice", 6000.0));
        employees.add(new Employee(3, "Bob", 4000.0));
        employees.add(new Employee(4, "David", 5500.0));
        employees.add(new Employee(5, "Emily", 4500.0));

      
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }

       
        Collections.sort(names);

      
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
