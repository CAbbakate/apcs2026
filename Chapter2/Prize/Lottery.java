import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Lottery{
    
    public static List<Integer> BubbleSort(List<Integer> Sortlist){
        
        int finalcheck = Sortlist.size(), temp;
        
        // Final item in list is always correctly sorted
        while(finalcheck > 0){
            // Loop through list
            for(int i = 0; i<finalcheck-1;i++){
                // Swap if out of order
                if(Sortlist.get(i) > Sortlist.get(i+1)){
                    temp = Sortlist.get(i);
                    Sortlist.set(i,Sortlist.get(i+1));
                    Sortlist.set(i+1,temp);
                }
                
            }
            finalcheck = finalcheck - 1;
        }
        
        return Sortlist;
    }


    public static void main(String[] args){
        System.out.println(args);
        int temp;
        List<Integer> winner = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            winner.add((int)(Math.random() * 61 + 1));
        }
        
        System.out.println(winner);
        
        winner = BubbleSort(winner);
        System.out.println(winner);
    }
}