 import java.util.Scanner;
 import java.text.NumberFormat;
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
        String name = new String("Meowmeowmeowmeow");
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Set currency
        String currency = "$";
        
        // Get starting mo
        System.out.printf("How much money do you have?: " + currency);
        
        double lunchPrice, totalCost, income;
        int lpm; //Lunches per week
        
        System.out.print("How much does lunch cost every day?: " + currency);
        lunchPrice = input.nextInt();
        
        System.out.print("How many lunchs do you get per week?: ");
        lpm = input.nextInt();
        
        System.out.print("How much money do you make per week??: " + currency);
        income = input.nextInt();
        
        totalCost = lunchPrice*lpm;
        
        System.out.printf("--- Weekly Budget Summary fr %s ---", name); 
        // %s allows placeholders for strings
        
        System.out.println(money.format(income));
        System.out.println(money.format(lunchPrice));
        System.out.println(money.format(totalCost));
        
    }
}