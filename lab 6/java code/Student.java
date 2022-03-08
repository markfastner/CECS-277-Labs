/**
 * Mark Fastner
 * 10/14/2020
 * creates an objects Student that contains a name
 */
public class Student {
    private String name;
    //sets defaukt name to blank
    public Student(){
        name = "Blank";
    }
    //construcot that sets name
    public Student(String Name){
        name = Name;
    }
    //returns the name
    public String getName(){
        return name;
    }
    //allows for name to change
    public void setName(String newName){
        name = newName;
    }

}
