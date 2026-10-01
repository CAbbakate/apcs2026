
/**
 * Write a description of class ChessData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class ChessData
{
    public static void main(String[] args) throws FileNotFoundException{
        String user;
        int lines, count=1;
        String[] data;
        File dataFile;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Avalible files to read: ");
        System.out.println("chessgames.csv\nsleepdata.csv\nmediaimpact.csv\n");
        
        System.out.print("What file would you like to read?: ");
        user = input.nextLine().toLowerCase();
        
        System.out.print("How many lines would you like to read?: ");
        lines = input.nextInt();
        
        if(user.substring(user.length() -4, user.length()).equals(".csv")){
            dataFile = new File(user);
        }
        else{
            dataFile = new File(user + ".csv");
        }
        
        Scanner fileScan = new Scanner(dataFile);   
        
        while(fileScan.hasNextLine() && lines != 0){
            data = fileScan.nextLine().split(",");
            System.out.print(count + ": ");
            
            for(int i=0; i<data.length; i++){
                System.out.print(data[i] + "\t");
            }
            
            System.out.println();
            lines --;
            count ++;
        }
        fileScan.close();
        
        
    }
}
