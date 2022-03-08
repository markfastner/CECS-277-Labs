import java.time.Period;

/**
 A coin with a monetary value.

 */

public class Coin {   //[ 2 points] YOUR CODE to declare the private data members for the class Coin


    private double value;
    private String name;

/**

 Constructs a coin.

 @param aValue the monetary value of the coin

 @param aName the name of the coin

 */



//[ 2 points] YOUR CODE
public Coin(){
    value = 0;
    name = " ";
}
public Coin(double aValue, String aName){
    value = aValue;
    name = aName;
}


/**

 Gets the coin value.

 @return the value

 */

//[ 2 points]YOUR CODE
    public double returnValue(){
        return value;
    }


/**

 Gets the coin name.

 @return the name

 */

//[ 2 points]YOUR CODE
    public String getName(){
        return name;
    }


}
