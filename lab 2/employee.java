/**
 * This program creates the object "Employee" which takes in two parameters:
 * 1. The name of the employee
 * 2. The salary of the employee
 *
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #2)
 */

public class employee {

    private String name;
    private int salary;

    public employee() {
    }

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee name: " + name + "\nSalary: " + salary;
    }
}
