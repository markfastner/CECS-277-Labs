/**
 * Staff is a subclass of Employee that inherits its variables(first, last, id) and
 * has a new variable called hourly rate
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #3)
 */
public class Staff extends Employee{
    double hourly_rate;
    //default constructor sets hourlyrte to 0
    public Staff(){
        super();
        hourly_rate = 0;
    }
    //constructor that takes in lasat,first,id and hourly rate as paramaters
    public Staff(String last, String first, String id, double hourly_rate){
        super(last, first, id);//gets last,first, and id from fatherclass
        this.last = last;
        this. first = first;
        this.id = id;
        this.hourly_rate = hourly_rate;
    }
    //override the monthlyEarning and returns the hourly rate times the STAFF_MONTHLY_HOURS_WORKED
    //which is gotten from the interface EmployeeInfo
    @Override
    public double monthlyEarning() {
        return hourly_rate * STAFF_MONTHLY_HOURS_WORKED;
    }
    //to String prints out all the variables from employee as well as the monthly earning
    @Override
    public String toString() {
        return "Staff{" +
                " last='" + last + '\'' +
                ", first='" + first + '\'' +
                ", id='" + id + '\'' +
                ", Monthly salary=" + monthlyEarning() + '\'' +
                '}';
    }
}
