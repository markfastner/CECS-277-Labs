/**
 * Faculty is a class that is a sublclass of employee and inherits its variables(first,last, and id)
 * Faculty contains an enum which defines what level the faculty is(assistant professor, associate professor, professor)
 * @author Liam Abalos
 * @author Mark Fastner
 * CECS 277 Lab (Lab #3)
 */
public class Faculty extends Employee {
    //enum with 3 different levels(AS, AO, FU) which represent assistant professor, associate professor, professor
    public enum Level{
        AS, AO, FU
    };
    //creates an instance of level and education
    private Level profs;
    private  Education education;
    //default constructor sets the instance of level we created to as and creates and nee education
    public Faculty(){
        profs = Level.AS;
        education = new Education();
    }
    //constructor that takes in the variables from employee as well as a type of professor(enum) and an education(object)
    public Faculty(String last, String first, String id, Level profs, Education education){
        super(last, first, id);
        this.profs = profs;
        this.education = education;
    }
    //setters and getters for profs and education
     private Level getProfs(){
        return profs;
     }
     private void setProfs(Level newProfs){
        profs = newProfs;
     }
     private Education getEducation(){
        return education;
     }
     private void setEducation(Education newEducation){
        education = newEducation;
     }

     //overides the monthly earnings in employee and returns the monthly earning bsed of what
    //type of professor they are
    @Override
    public double monthlyEarning() {
        if(profs == Level.AS){
            return FACULTY_MONTHLY_SALARY;
        }
        else if(profs == Level.AO){
            return FACULTY_MONTHLY_SALARY * 1.5;
        }
        else if(profs == Level.FU){
            return FACULTY_MONTHLY_SALARY * 2.0;
        }
        else{
            return 0;
        }
    }

    //to string that prints the variables from employee as well as the professor type and the monthly earning
    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", Professor type='" + profs + '\'' +
                ", Monthly Earnings='" + monthlyEarning() + '\'' +
                '}';
    }
}
