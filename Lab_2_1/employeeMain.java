/**
 * This program is the main and creates 4 employees:
 * - 2 normal employees
 * - 1 manager
 * - 1 executive
 * And it prints out all of them to the screen.
 *
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #2)
 */

public class employeeMain {
    public static void main(String[] args) {
        employee Liam = new employee("Liam", 60000);
        System.out.println(Liam.toString());
        employee Joseph = new employee("Joseph", 50000);
        System.out.println(Joseph.toString());
        manager Mark = new manager("Mark", 90000, "Operations & Fiance");
        System.out.println(Mark.toString());
        executive Tom = new executive("Tom", 120000, "CEO");
        System.out.println(Tom.toString());
    }
}
