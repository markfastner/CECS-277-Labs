/**
 * Mark Fastner
 * 10/14/2020
 * This class cretes an object course which consists of a course name a grade that the student received in the course
 */
public class Course {
    Grade g;
    String course_name;
    //default constructor that creates a blank course name and default grade
    public Course(){
        g = new Grade();
        course_name = "BLANK";
    }
    //construcot that sets the course name and grade
    public Course(String aCourse_Name, Grade grade){
        course_name = aCourse_Name;
        g = grade;
    }
    //returns coursename
    public String getCourse_name(){
        return course_name;
    }
    //returns the grade in the course
    public Grade getGrade(){
        return g;
    }
    //sets the grade in the course in case it needs to be changed
    public void setGrade(Grade newGrade){
        g = newGrade;
    }

}
