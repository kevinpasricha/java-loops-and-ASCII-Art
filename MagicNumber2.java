import java.util.*;

public class MagicNumber2  {
    // The magic number game has the user trying to
    // guess which number between 1 and 100 the
    // computer has picked
    
    public static void main(String[] args)  {
        Scanner keyb = new Scanner(System.in);
        Random newRandomNumber = new Random();
        int magic, guess;
        int tries = 1;
        
        // Use the random number function to pick a
        // number
        magic = newRandomNumber.nextInt(100) + 1;
        
        do { 
            // Let the user make a guess
            System.out.println("Guess ?");
            guess = keyb.nextInt();
            
            // Tell him whether it's too high or too low
            if (guess > magic)
                System.out.println(".. Wrong .. Too high\n");
            else
                System.out.println(".. Wrong .. Too low\n");     
                tries++;
        } while (guess != magic);
        
        // If the user won, tell him/her
        
        if (guess == magic) {
            System.out.println("** Right!! ** ");
            System.out.println(magic + " is the magic number\n");
        }
        
        // Tell the user how many guesses it took
        System.out.println("You took " + tries  + " guesses\n");
    }
}
