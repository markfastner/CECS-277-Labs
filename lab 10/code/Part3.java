import java.util.*;
public class Part3
{
    public static void main(String [] args)
    {
        String text = "Good morning.Have a good class." + "Have a good visit.Have fun!";
        //Create a TreeMap to hold words as key and count as value
        //YOUR CODE
        TreeMap<String, Integer> StringMap = new TreeMap<String,Integer>();
        //Extracting a word from a text by using the split method in the String
        //class. The words will be a, class, fun, good, Good, Have, morning and visit.
        String [] words = text.split("[ \n\t\r.,;:!?(){}]");
        //For each word extracted in the array words, WRITE CODE to check whether it is already in
        //the stored as a key in the map (use the methods containsKey). If not, a new pair consisting of
        //the word and its initial count is stored in the map.
        //Otherwise, the count for the word is incremented by 1.
        //YOUR CODE
        for(int i =0; i< words.length;i++)
        {
            words[i] = words[i].toLowerCase();
            System.out.println(words[i]);
        }
        int count = 0;
        for (String s : words)
        {

            if (StringMap.containsKey(s))
            {
                StringMap.put(s, StringMap.get(s)+1);
            }
            else
            {
                StringMap.put(s, 1);
            }
        }
        //Write code to obtain entries of the map in a set, and traverse the set to display the key
        //and the count in each entry.entries into a set
        //YOUR CODE

        System.out.println();
        for (String word: StringMap.keySet())
        {
            String key = word.toString();
            String value = StringMap.get(word).toString();
            System.out.println(key + " " + value);
        }
    }//end main
}//end class