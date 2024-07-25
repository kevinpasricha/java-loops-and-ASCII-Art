import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        // Ask if employee is married
        System.out.println("What is your marital status (0 if single, 1 if married)?: ");
        int maritalStatus = keyb.nextInt();

        // Ask how many children
        System.out.println("How many children do you have?: ");
        int numberOfChildren = keyb.nextInt();

        // Ask how many hours worked
        System.out.print("How many hours have you worked?: ");
        int hoursWorked = keyb.nextInt();

        // Calculate base pay rate
        int basePayRate = (maritalStatus == 1) ? 15 : 10;

        // Calculate extra pay for children
        int extraPayForChildren = Math.min(numberOfChildren, 4);

        // Calculate regular and overtime hours
        int regularHours = Math.min(hoursWorked, 40);
        int overtimeHours = Math.max(hoursWorked - 40, 0);

        // Calculate gross pay
        double grossPay = (regularHours * (basePayRate + extraPayForChildren)) +
                          (overtimeHours * (basePayRate + extraPayForChildren) * 1.5);

        // Calculate income tax
        double incomeTax = 0;
        if (grossPay >= 300 && grossPay < 400) {
            incomeTax = grossPay * 0.05;
        } else if (grossPay >= 400 && grossPay < 600) {
            incomeTax = grossPay * 0.08;
        } else if (grossPay >= 600) {
            incomeTax = grossPay * 0.10;
        }

        // Calculate net pay
        double netPay = grossPay - incomeTax;

        // Print results
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Income Tax: $" + incomeTax);
        System.out.println("Net Pay: $" + netPay);
    }
}

