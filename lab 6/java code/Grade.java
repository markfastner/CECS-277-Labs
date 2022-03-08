/**
 * Mark Fastner
 * 10/14/2020
 * This class creates an object grade which consists of a char representing the letter grade
 * that is received in school.
 */
public class Grade {
    private char letter_grade;
    //base constructor that defaults the letter grade to an F
    public Grade(){
        letter_grade = 'F';
    }
    //constructor that takes in a letter grade
    public Grade(char aLetter_Grade){
        letter_grade = aLetter_Grade;
    }
    //returns the letter grade
    public char getLetter_grade() {
        return letter_grade;
    }
    //sets teh letter grade
    public void setLetter_grade(char newGrade){
        letter_grade = newGrade;
    }
    //this method returns the point value of each possible letter grade
    public double getPoint(){
        if(letter_grade == 'A'){
            return 4.0;
        }
        if(letter_grade == 'B'){
            return 3.0;
        }
        if(letter_grade == 'C'){
            return 2.0;
        }
        if(letter_grade == 'D'){
            return 1.0;
        }
        if(letter_grade == 'F'){
            return 0;
        }
        return 0;
    }
}
