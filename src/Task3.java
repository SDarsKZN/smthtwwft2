import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //это первое нормальное\третье задание
        Scanner scanfor1 = new Scanner(System.in);
        int b = scanfor1.nextInt();
        for (int str = 1; str <=b; str++){
            System.out.println();
            for(int i = 1; i <=str; i++){
                System.out.print("*");
            }
        }
        //это четвёртое нормальеное задание\шестое задание
            Scanner scannfor4 = new Scanner(System.in);
            int a = scannfor4.nextInt();
            for (int str = 1; str <= a; str++) {
                System.out.println();
                for (int j = 1; j < str; j++) {
                    System.out.print(" ");
                }
                for (int num = str; num <= a; num++) {
                    System.out.print("* ");
                }
            }
        //это второе нормальное\четвёртое задание
        Scanner scanfor2 = new Scanner(System.in);
        int c = scanfor2.nextInt();
        for (int str = 1; str <=c; str++){
            System.out.println();
            for (int i = str+1; i <= c; i++){
                System.out.print(" ");
            }
            for(int j = 1; j <=str; j++){
                System.out.print("*");
            }
        }
        //это третье нормалльное\пятое задание
        Scanner scanfor3 = new Scanner(System.in);
        int d = scanfor3.nextInt();
        for (int str = 1; str <=d; str++){
            System.out.println();
            for (int i = str+1; i <= d; i++){
                System.out.print(" ");
            }
            for(int j = 1; j <=str; j++){
                System.out.print("* ");
            }
        }
    }
}