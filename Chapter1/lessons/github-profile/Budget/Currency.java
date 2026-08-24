 import java.util.Scanner;
/**
 * Write a description of class Currency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Currency{
    // Calculate weekly lunch spending & Remaining $
    public static void main(String[] args){
        
        //Instantiate scanner obj
        Scanner input = new Scanner(System.in);
        
        // Set currency
        String currency = "$";
        
        // Get starting mo
        System.out.printf("How much money do you have?: " + currency);
        
        double lunchPrice, totalCost, income;
        int lpm; //Lunches per week
        double money = input.nextInt();
        
        System.out.print("How much does lunch cost every day?: " + currency);
        lunchPrice = input.nextInt();
        
        System.out.print("How many lunchs do you get per week?: ");
        lpm = input.nextInt();
        
        System.out.print("How much money do you make per week??: " + currency);
        income = input.nextInt();
        
        totalCost = lunchPrice*lpm;
        
        System.out.println(income);
        System.out.println(lunchPrice);
        System.out.println(totalCost);
        
    }
}