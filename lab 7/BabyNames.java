import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 This program takes in a list of baby names and outputs a list of boys and
 girls names.
 */
public class BabyNames
{
    /**
     Reads name information and returns it. It also consumes the
     count values on the input line.
     @return the next name
     */
    public static String processName(Scanner in) {
        try {
            String name_data = "";
            name_data = in.next() + " " + in.next() + " " + in.next();
            //System.out.println("name data: " + name_data);
            return name_data;
        } catch (NoSuchElementException e) {
            System.out.println("File format not valid.");
        }
        return "";
    }

    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(new File("babynames.txt"));
             PrintWriter boyOut = new PrintWriter("boynames.txt");
             PrintWriter girlOut = new PrintWriter("girlnames.txt"))
        {
            while (in.hasNextInt())
            {
                int rank = in.nextInt();
 //System.out.println(processName(in));
 //System.out.println(processName(in));
                boyOut.println(processName(in));
                girlOut.println(processName(in));
            }
            in.close();
            boyOut.close();
            girlOut.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}