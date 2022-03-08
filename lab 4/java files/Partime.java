/**
 * Partime is a class that extends and adds a variable that keeps track of the hours worked per week
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #3)
 */
public class Partime extends Staff implements EmployeeInfo {//implements the interface employeeInfo
    int hours_worked_per_week;
    //default constructor taht sets hours worker per week to 0
    public Partime(){
        super();
        hours_worked_per_week = 0;
    }
    //constructor that takes in the variables from staff as well as hours worked per week
    public Partime(String last, String first, String id, double hourly_rate, int hours_worked_per_week) {
        super(last, first, id, hourly_rate);
        this.last = last;
        this.first = first;
        this.id = id;
        this.hourly_rate = hourly_rate;
        this.hours_worked_per_week = hours_worked_per_week;
    }
    //setter and getter for hours worked per week
    private int getHours_worked_per_week(){
        return hours_worked_per_week;
    }
    private void setHours_worked_per_week(int newHours){
        hours_worked_per_week = newHours;
    }

    //returns the monthly earning which is based on the hourly rate and the hours_worked_per_week
    @Override
    public double monthlyEarning() {
        return hourly_rate * (hours_worked_per_week * 4);
    }

    //to string that prints the variables from staff as well as the hours worked per month
    @Override
    public String toString() {
        return "Partime{" +
                "id='" + id + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", hours_worked_per_month=" + (hours_worked_per_week * 4) +
                ", Monthly Earnings ='" + monthlyEarning() + '\'' +
                '}';
    }
}
