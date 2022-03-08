/**
 * Mark Fastner
 * 10/14/2020
 * This class creates an object Report card thatconsists of a students name, and a list of courses
 */

import java.util.ArrayList;

public class ReportCard {
    ArrayList<Course> courses;
    private String Student_Name;
    //default constructor that creates a blank report card
    public ReportCard(){
        courses = new ArrayList<Course>();
        Student_Name = "NO NAME";
    }
    //constructor that sets a student name and the courses the are taking
    public ReportCard(String AStudent_Name, ArrayList<Course> Courses){
        courses = Courses;
        Student_Name = AStudent_Name;
    }
    //calculates the students gpa based of the grade of all the courses
    //adds up the grade point of every class and devides by number of class
    //returns the gpa
    public double calculateGpa(){
        double gpa = 0;
        for(Course temp: courses){
            gpa += temp.getGrade().getPoint();
        }
        return gpa/courses.size();
    }
    //neatly formats the report card stating the course name the letter grade and the point value of each grade
    public String CourseNameandGrade(){
        String data = "";
        for(Course temp: courses){
            data+= temp.getCourse_name() + " " + temp.getGrade().getPoint() + " " +  temp.getGrade().getLetter_grade() + "\n";
        }
        return data;
    }
    //to string prints the report card including everything in the previous method as well as the student name
    //and the gpa
    public String toString(){
        return Student_Name + "\n" + CourseNameandGrade() + "GPA: " + calculateGpa();

    }
}
