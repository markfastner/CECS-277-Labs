import java.util.*;


public class Part2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Employee> EmployeeSet = new TreeSet<Employee>();
        //Set<Employee> EmployeeSet = new TreeSet<Employee>(new SalaryComparator());
        Employee e1 = new Employee ("eee",78000.0);
        Employee e2 = new Employee ("bbb",45000.0);
        Employee e3 = new Employee ("ccc",100000.0);
        EmployeeSet.add(e1);
        EmployeeSet.add(e2);
        EmployeeSet.add(e3);
        Iterator get = EmployeeSet.iterator();
        while (get.hasNext())
        {
            System.out.println(get.next().toString());
        }



    }

}
