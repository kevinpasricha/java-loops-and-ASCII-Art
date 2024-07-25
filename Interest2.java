public class Interest2 {
    // Calculate the interest that the Canarsie 
    // Indians could have accrued if they had 
    // deposited the $24 in a bank account at
    // 5% interest. 
    
    public static void main(String[] args)  {
        final int present = 2005;
        int       year;
        final double rate = 0.05;
        double       interest, principle;
        
        // Set the initial principle at $24
        principle = 24;
        
        // For every year since 1625, add 5% interest
        // to the principle and print out 
        // the principle
        
        for  (year = 1625;  year < present;  year++) {
            interest = rate * principle;
            principle = principle + interest;
            
            System.out.printf("year = %4d\tprinciple = $%13.2f\n", 
                        year, principle);
        }
    }

}