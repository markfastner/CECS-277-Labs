/**
 * This program extends the manager class to specify which employees are executives.
 *
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #2)
 */

public class executive extends manager {
    public executive() {
        super();
    }

    public executive(String name, int salary, String department) {
        super(name, salary, department);
    }

    public String toString() {
        return super.toString() + "\nExecutive: Yes";
    }
}