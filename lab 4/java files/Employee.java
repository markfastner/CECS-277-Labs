/**
 * This employee class is an abstract class that
 * implements EmployeeInfo and is the parent class for Staff and Faculty
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #3)
 */
public abstract class Employee implements EmployeeInfo {
    //initialize variables used by all employees
    String last;
    String first;
    String id;
    //default constructor
    //sets variables to blank
    public Employee(){
        last = "BLANK";
        first = "BLANK";
        id = "BLANK";
    }
    //constructor that takes in a last name first name and an id
    public Employee(String last, String first, String id){
        this.last = last;
        this.first = first;
        this.id = id;
    }
    //setters and getters for variables: first, last, and id
    public String getLastName(){
        return last;
    }
    public void setLastName(String newLast){
        last = newLast;
    }
    public String getFirstName(){
        return first;
    }
    public void setFirstName(String newFirst){
        first = newFirst;
    }
    public String getId(){
        return id;
    }
    public void setId(String newId){
        id = newId;
    }
    //abstract method that will be filled in in subclasses
    public abstract double monthlyEarning();

    //to String that prints out all the variables of employee: first name, last name, and ID
    @Override
    public String toString() {
        return "Employee{" +
                "last='" + last + '\'' +
                ", first='" + first + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
