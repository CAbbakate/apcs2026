import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Bruteforce
{
    
    public static int check(List<String>Password,List<String> Guess){
        
        if (Guess.size() == Password.size()){
            Boolean pass = true;
            for(int i = 0; i < Password.size(); i++){
                if (! Password.get(i).equals(Guess.get(i))){
                    pass = false;
                }
            }
            if (pass){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args)
    {
        int keyindex = 0, index = 0, loop = 1, Attempts = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the password you'd like to crack: ");
        String password = new String(input.nextLine());
        
        List<String> Key = List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"), Pass = new ArrayList<String>(),LetterGuess = new ArrayList<String>();
        List<Integer> Guess = new ArrayList<Integer>();
        
        for(int i = 0; i<password.length(); i++){
            Pass.add(Character.toString(password.charAt(i)));
        }
        
        System.out.println("\nCracking password . . .\n");
        
        long Startime = System.nanoTime();
        
        Guess.add(0);
        //Build guess
        while(loop == 1){
            Guess.set(0, Guess.get(0) + 1) ;
            for(int i = 0; i< Guess.size(); i++){
                if (Guess.get(i) > Key.size()-1){
                    if(i == Guess.size()-1){
                        Guess.add(0);
                    }
                    Guess.set(i, 0);
                    Guess.set(i+1, Guess.get(i+1) + 1) ;
                }
            }
            
            LetterGuess = new ArrayList<String>();
            
            for(int i = 0; i < Guess.size(); i++){
                LetterGuess.add(Key.get(Guess.get(i)));
            }
            
            
            // Check
            loop = check(Pass,LetterGuess);
            if (Attempts % 10000000 == 0){
                System.out.println(LetterGuess);
            }
            Attempts += 1;
        }
        
        double miliduration = (System.nanoTime() - Startime)/1000000;
        System.out.println("Password cracked!");
        System.out.println("Eloted time:" + miliduration + "ms");
        System.out.println("("+ miliduration/1000 + "s)");
        System.out.println("Attepts: " + Attempts);
        
        System.out.print("Password: \t");
        for(int i=0; i < LetterGuess.size(); i++){
            System.out.print(LetterGuess.get(i));
        }
    
        
    }   
}