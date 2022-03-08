import java.util.*;
import java.text.DecimalFormat;
public class Lottery
{
    // Winning numbers should be between 1 and 40
    public static Set<Integer> generateWinningNumbers(){
        int max = 9;
        int min = 1;
        Set<Integer> tempSet = new TreeSet<Integer>();
        for(int i = 0; i < 6; i++){
            int num = (int) (Math.random() * (max - min + 1) + min);
            tempSet.add(num);
        }
        return tempSet;
    }
    // Read the player's lottery ticket from the console
    public static Set<Integer> getTicket(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type 6 lotto numbers: ");
        Set<Integer> tempSet = new TreeSet<Integer>();
        for(int i = 0; i < 6; i++){
            tempSet.add(scan.nextInt());
        }
        scan.close();
        return tempSet;
    }
    public static void main(String[] args) {
        Set<Integer> mySet = getTicket();
        Set<Integer> winSet = generateWinningNumbers();
        System.out.println("Your ticket was: " + mySet);
        System.out.println("Winning numbers: " + winSet);
        winSet.retainAll(mySet);
        System.out.println("Match numbers: " + winSet);
        double num = 0;
        for(int i = 0; i < winSet.size(); i++){
            num = num + 250;
        }
        DecimalFormat FORMAT = new DecimalFormat("$#.00");
        System.out.println("Your prize is " + FORMAT.format(num));
    }
}