/**
 * Mark Fastner
 * 10/14/2020
 * 'This class is a tester that tests our other classes b creating instances of those objects previously created
 */

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //creates a student named mark
        Student Mark = new Student("Mark");

        //creates all teh possible grades
        Grade A = new Grade('A');
        Grade B = new Grade('B');
        Grade C = new Grade('C');
        Grade D = new Grade('D');
        Grade F = new Grade('F');

        //makes up courses that mark is taking
        Course Math = new Course("MATH", A);
        Course English = new Course("ENGLISH", B);
        Course History = new Course("HISTORY", C);
        Course Physics = new Course("PHSICS", D);
        Course Computer_Science = new Course("COMPUTER SCIENCE", F);

        //adds courses to an arraylist
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(Math);
        courses.add(English);
        courses.add(History);
        courses.add(Physics);
        courses.add(Computer_Science);

        //creates a report card taking in the student name and the araylist of all the
        //courses the student is taking
        //prints out the report card
        ReportCard rc = new ReportCard(Mark.getName(), courses);
        System.out.println(rc);

    }
}
