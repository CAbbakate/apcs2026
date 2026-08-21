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
        System.out.print("How much money do you have?: " + currency);
        
        double lunchPrice, totalCost, income;
        int lpm; //Lunches per week
        double money = input.nextInt();
        
        System.out.print("How much does lunch cost every day?: " + currency);
        input.nextLine();
        lunchPrice = input.nextInt();
        
        System.out.print("How much money do you make per week??: " + currency);
        input.nextLine();
        income = input.nextInt();
        
        System.out.println("\nYou have: " + currency + String.format("%.2f",money));
        
        System.out.println("\nWeekly cost of lunch: "+ currency + String.format("%.2f",7 * lunchPrice));    
        
    System.out.println("\nWeeks of lunch you can afford: " + String.format("%.2f",(income+money)/(7 * lunchPrice))); 
    System.out.println("\nDays of lunch you can afford: " + String.format("%.0f",(income+money)/(lunchPrice)));   
    }
}