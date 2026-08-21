// The Java compiler turns our source code into bytecode that is run by the JVM (Java Virtual Machine)
public class MyFirstProgram
{
    /* 
    The main method is where processing begins in a Java program
        Parameters: 
            String[] args: Stores command-line arguments passed to the program
                Example: java MyFirstProgram config.txt 3000
                                               args[0]  args[1]
    */
    public static void main(String[] args)
    {
        // This prints a message to the console.
        System.out.println("Go, Redhawks!");

        // This also prints a message to the console.
        System.out.print("What's the difference between a poorly dressed man on a bicycle and a well-dressed man on a tricycle? ");
        System.out.print("Attire");
    }
}