import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
            Scanner scann = new Scanner(System.in);
            int a = scann.nextInt();
            for (int str = 1; str <= a; str++) {
                System.out.println();
                for (int j = str; 1 <= a-j; j++) {
                    System.out.print(" ");
                }
                for (int num = 1; num <= str; num++) {
                    System.out.print("* ");
                }
            }
    }
}