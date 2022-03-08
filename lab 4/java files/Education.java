/**
 * This class creates a level of education for employees
 * each education has a level of Degree, a Major, and amount of research
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #3)
 */
public class Education implements EmployeeInfo {
    String Degree;
    String Major;
    int Research;
    //default constructor leaves variables blank
    public Education(){
        Degree = "NONE";
        Major = "NONE";
        Research = 0;
    }
    //constructor that takes in a degree, major and research
    public Education(String Degree, String Major, int Research){
        this.Degree = Degree;
        this.Major = Major;
        this.Research = Research;
    }
    //setters and getters for degree, major, and research
    public String getDegree(){
        return Degree;
    }
    public void setDegree(String newDegree){
        Degree = newDegree;
    }
    public String getMajor(){
        return Major;
    }
    public void setMajor(String newMajor){
        Major = newMajor;
    }
    public int getResearch(){
        return Research;
    }
    public void setResearch(int newResearch){
        Research = newResearch;
    }

}
