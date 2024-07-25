import java.util.Scanner;

public class KeepAsking  {
  // A simple example of how while works
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    int number;
    
    //Get your first number
    System.out.println("Hi there.  Pick a positive integer");
    number = keyb.nextInt();
 
    //Keep reading number as long as they are positive
    while (number > 0) {

      System.out.println
            ("Pick another positive integer");
      number = keyb.nextInt();
    }
    
    System.out.println
         (number + " is not a positive integer");
  }
}
