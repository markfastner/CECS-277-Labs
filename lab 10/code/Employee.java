import java.util.*;
public class Employee implements Comparable<Employee>
{
    String name;
    double salary;
    public Employee(String name, double s)
    {
        this.name = name;
        salary = s;
    }
    public String toString()
    {
        return ( this.name + "," + this.salary);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary == o.salary){
            return 0;
        }
        else if(this.salary > o.salary){
            return 1;
        }
        return -1;
    }


}//end clas