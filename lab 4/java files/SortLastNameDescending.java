import java.util.Comparator;

public class SortLastNameDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b){
        return b.last.compareTo(a.last);
    }
}
