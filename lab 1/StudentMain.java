import java.util.ArrayList;
public class StudentMain {
    public static void main(String[] args) {
        Student Liam = new Student("Liam", "1");
        Student Joseph = new Student("Joseph", "2");
        Student Sam = Liam;
        System.out.println(Liam.getName() + Liam.getID());
        System.out.println(Joseph.getName() + Joseph.getID());
        System.out.println(Sam.getName() + Sam.getID());
        if (Liam.equals(Sam)) {
            System.out.println("Identical");
        }
        else {
            System.out.println("Not identical");
        }
        ArrayList<Student> StudentList = new ArrayList<Student>();
        StudentList.add(Liam);
        StudentList.add(Joseph);
        StudentList.add(Sam);
        System.out.println(StudentList);
    }
}