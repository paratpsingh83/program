import java.util.*;
import java.util.stream.*;

class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int employeeId, String firstName, String lastName, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Override toString() to print Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeFilter {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "Doe", 60000),
                new Employee(2, "Jane", "Smith", 45000),
                new Employee(3, "Jim", "Brown", 75000),
                new Employee(4, "Jack", "White", 55000),
                new Employee(5, "Jill", "Green", 90000)
        );

        // Filter employees with salary greater than 50,000 and sort by salary in descending order
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)  // Filter employees with salary greater than 50,000
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))  // Sort in descending order
                .collect(Collectors.toList());

        // Print the filtered and sorted list
        System.out.println("Employees with salary greater than 50,000 (Sorted in Descending Order):");
        highSalaryEmployees.forEach(System.out::println);

        // Filter employees with salary between 55,000 and 80,000 and sort by salary in descending order
        List<Employee> middleSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() >= 55000 && emp.getSalary() <= 80000)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))  // Sort in descending order
                .collect(Collectors.toList());

        // Print the filtered and sorted list
        System.out.println("\nEmployees with salary between 55,000 and 80,000 (Sorted in Descending Order):");
        middleSalaryEmployees.forEach(System.out::println);

        // Filter employees with salary less than or equal to 60,000 and sort by salary in descending order
        List<Employee> lowSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() <= 60000)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))  // Sort in descending order
                .collect(Collectors.toList());

        // Print the filtered and sorted list
        System.out.println("\nEmployees with salary less than or equal to 60,000 (Sorted in Descending Order):");
        lowSalaryEmployees.forEach(System.out::println);
    }
}
