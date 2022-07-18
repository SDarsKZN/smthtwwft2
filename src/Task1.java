import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //задание
        int s = 0;
        while (s < 10) {
            Scanner scan1 = new Scanner(System.in);
            int day = scan1.nextInt();
            int thebest = day;
            if(day <= 365) {
                if (thebest <= 31 && thebest > 0) {
                    System.out.println("janyary");
                }
                if (thebest > 31 && thebest <= 59) {
                    System.out.println("feb");
                }
                if (thebest > 59 && thebest <= 90) {
                    System.out.println("march");
                }
                if (thebest > 90 && thebest <= 120) {
                    System.out.println("apr");
                }
                if (thebest > 120 && thebest <= 151) {
                    System.out.println("may");
                }
                if (thebest > 151 && thebest <= 181) {
                    System.out.println("jyne");
                }
                if (thebest > 181 && thebest <= 212) {
                    System.out.println("jule");
                }
                if (thebest > 212 && thebest <= 242) {
                    System.out.println("aug");
                }
                if (thebest > 242 && thebest <= 273) {
                    System.out.println("sept");
                }
                if (thebest > 273 && thebest <= 303) {
                    System.out.println("oct");
                }
                if (thebest > 303 && thebest <= 334) {
                    System.out.println("nov");
                }
                if (thebest > 334 && thebest <= 365) {
                    System.out.println("dec");
                }
                if (thebest == 0) {
                    System.out.println("dec");
                }
                s=1;
            }
            else
                s=s+1;
        }
    }
}