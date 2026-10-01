
/**
 * Write a description of class Ledger_Processor here.
 *
 * @author Katrina
 * @version 9/30/26
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class Ledger_Processor
{
    //adding throws allows java to handle an error
   public static void main(String[] args) throws FileNotFoundException
   {
       // Connect scanenr to file
       // File must be in same folder
       File dataFile = new File("transAction.txt");
       Scanner fileScan = new Scanner(dataFile);
       
       NumberFormat money = NumberFormat.getCurrencyInstance();
       
       // Counter and accumalator ariables 
       int count = 0;
       double totalSales = 0, price, average;
       String line;
       
       System.out.println("- + - + Daily Transaction Ledger + - + -");
       
       //Loop through lines of a file
       while(fileScan.hasNextLine()){
           line = fileScan.nextLine();
           price = Double.parseDouble(line);
           
           count++;
           totalSales += price;
           System.out.println("Transaction #" + count + ": \t" + money.format(price));
       }
       
       fileScan.close();
    average = totalSales/count;
    
    System.out.println("\n\nTotal Sales: \t" + count);
    System.out.println("Total Revenue: \t" + money.format(totalSales));
    System.out.println("Average: \t" + money.format(average));
    
    }
}
