import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Lottery{
    
    public static int Check(List<Integer> checklist, List<Integer> Key){
        int equals = 1;
        for(int i=0; i<Key.size();i++){

            {
               equals = 0; 
            }
        }
        
        return equals;
    }
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
    //13 33 40 11

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many digits would you like to use?: ");
        int temp, loop = 0, count = 0, length = input.nextInt();
        List<Integer> winner = new ArrayList<Integer>(), Guess = new ArrayList<Integer>();
        
        for(int i = 0; i < length; i++){
            System.out.printf("Enter digit #%d: ",i+1);
            winner.add(input.nextInt());
        }
    
        //Sort list
        winner = BubbleSort(winner);
        
        //TEMP
        System.out.println(winner);
        
        while(Check(Guess,winner) == 0){
            Guess = new ArrayList<Integer>();
            for(int i = 0; i < length; i++){
                Guess.add((int)(Math.random() * 61 + 1));
            }
            count += 1;
            
            if (count % 1000000 == 0){
                System.out.println(Guess + " " + count);
            }
        }
        
        System.out.printf("\nIt took you %s attempts to win the lottery!", count);
        System.out.println("Final Lottery: " + winner);
    }
}