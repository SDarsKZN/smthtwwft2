import java.util.Scanner;
public class Mockery1 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int kv = one.nextInt();
        System.out.println(one);
        for(int i = 0; i < kv; i++) {
            System.out.print("*");
        }

        for(int i = 2; i < kv; i++){
            System.out.print("*");
            for(int j = 1; j < kv; j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }


        System.out.println();
        for(int i = 1; i <= kv; i++) {
            System.out.print("*");
        }
    }
}
