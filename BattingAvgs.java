import java.util.Scanner;
public class BattingAvgs {

    public static void main(String[] args)  {

    Scanner keyb = new Scanner(System.in);
int times, hits;
float battingAvg;

for (int player = 1; player <=9; player++) {
    System.out.println("Player" + player + ":");

System.out.println("How many times have you gone to bat?");
times = keyb.nextInt();

System.out.println("How many hits do you have?");
hits = keyb.nextInt();

if (times != 0) {
    battingAvg = (float) hits / times;
}else {
        battingAvg = 0;
    }
    
System.out.println("Player " + player + ": Hits = " + hits + ", At Bats = " + times + ", Batting Avg = " + battingAvg);

    }
}
}



