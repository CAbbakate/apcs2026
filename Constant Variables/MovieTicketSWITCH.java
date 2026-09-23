
/**
 * Write a description of class MovieTicket here.
 *
 * @Katrina
 * @9/21/2026
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class MovieTicketSWITCH
{
    
    public static String Senior(String color){
        if (color.toLowerCase().equals("green")){
            return "Senior";
        }
        return "Not a Senior.";
    }
    public static void main(String[] args){
        final double REGULAR_PRICE = 12.50, DISCOUNT_PRICE = 8.00, IMAX_SURCHARGE = 8.00, IMAX_70MM_SURCHARGE = 8.50, SMPUIPPBDIYB_SURCHARGE = 12000.50;
        
        double ticketPrice;
        int age, choice = 0;
        boolean matinee, pass;
        String yn;
        
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("* * Movie Ticket Calculator * *");
        
        System.out.println("""

        Select movie format: 
        
    1) Standard
    2) IMAX
    3) IMAX 70mm
    4) SUPER MAXIMUM PLUS ULTRA IMAX++ BLASTED DIRECTLY INTO YOUR BRAIN.
        """);
        while(choice <1 || choice > 4){
            System.out.print("Enter your choice (1-4)");
            choice = input.nextInt();
        }
        
        System.out.print("\nEnter the customer's age: ");
        age = input.nextInt();
        
        System.out.print("Is this a matinee showtime? (y/n): ");
        input.nextLine();
        yn = input.nextLine();
        matinee = yn.toLowerCase().equals("y");
        
        
        System.out.print("Does the customer have a pass? (y/n): ");
        yn = input.nextLine();
        pass = yn.toLowerCase().equals("y");
        
        ticketPrice = REGULAR_PRICE;
        
        switch(choice){
            //2
            case(2):
                ticketPrice = REGULAR_PRICE + IMAX_SURCHARGE;
            break;
            //3
            case(3):
                ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
            break;
            //4
            case(4):
                ticketPrice = REGULAR_PRICE + SMPUIPPBDIYB_SURCHARGE;
            break;
            
            //else
             default:
            //Discount if <13 , >=65, or matinee and pass
            if(age < 13 || age >= 65 || matinee && pass){
                ticketPrice = DISCOUNT_PRICE;
                System.out.println("\nDiscount Applied!");
            }
            else{
                System.out.println("\nNo discout for you!" );
            }
            break;
        }
        
        System.out.println("\nTicket price: " + money.format(ticketPrice));
    }
}
