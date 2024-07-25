import java.util.Scanner;

public class CalcGrade  {
    // Calculates the average test grade and
    // converts it to a letter grade assuming that
    // A is a 90 average, B is an 80 average and so
    // on.
    public static void main(String[] args)  {  
        Scanner keyb = new Scanner(System.in);
        final int sentinelGrade = -1;
        int thisGrade, numTests = 0, total; 
        double testAverage;
        char  courseGrade;
        
        // Initially, the total is 0
        total = 0;
        
        // Get the first grade
        System.out.println
            ("What grade did you get on your first test  ?");
        System.out.println("Enter -1 to end");
        thisGrade = keyb.nextInt();

        //Add up the test grades
        while (thisGrade != sentinelGrade) {
            // Make sure that the grades are valid percentages
            if (thisGrade > 100)
                System.out.println("This is not a valid test grade.");
            else if (thisGrade >= 0) {
                total = total + thisGrade;
                numTests++;
            }
            else
                System.out.println("This is not a valid test grade.");
            System.out.println("What grade did you get on this test  ?");
            thisGrade = keyb.nextInt();
        }
        
        // Find the average
        testAverage = total/numTests;
        
        // Find the letter grade corresponding to the average
        if (testAverage >= 90)
            courseGrade = 'A';
        else if (testAverage >= 80)
            courseGrade = 'B';
        else if (testAverage >= 70)
            courseGrade = 'C';
        else if (testAverage >= 60)
            courseGrade = 'D';
        else
            courseGrade = 'F';

        // Print the results.
        System.out.println("Your test average is " + testAverage);
        System.out.println("Your grade will be " + courseGrade);
    }
}
