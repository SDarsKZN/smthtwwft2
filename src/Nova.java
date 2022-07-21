import java.util.Scanner;
//this will be novella
public class Nova {
    public static void main(String[] args) {
        System.out.println("Welcome to Nova! Please, enter your name:");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        System.out.println("Ok, " + name + ", lets start.");
        System.out.println("");
    }
}