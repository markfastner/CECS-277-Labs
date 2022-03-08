/**
 * This program extends the employee class to specify which department the employee is working in.
 *
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #2)
 */

public class manager extends employee {
    private String department;

    public manager() {
        super();
        department = "";
    }

    public manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}
