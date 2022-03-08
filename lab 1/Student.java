public class Student {
    private String name;
    private String id;
    // constructor with two arguments
    public Student (String name, String id)
    {
        this.name = name;
        this.id = id;
    }
    //copy constructor
    public Student (Student other)
    {
        this.name = other.name;
        this.id = other.id;
    }
    public String getName() {
        return name;
    }
    public String getID(){
        return id;
    }
    public String toString()
    { //ENTER CODE to return name and id
        return name + id;
    }
    public boolean equals(Object other){
        boolean result = false;
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            result = id.equals(otherStudent.id);
        }
        return result;
    }
}