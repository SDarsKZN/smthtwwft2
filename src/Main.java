import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("Da.");
        byte num = 23;
        boolean newBool = true;
        // Дальше идёт задание
        Random rand1 = new Random();
        int amountofDays = rand1.nextInt(1,20);
        Random today = new Random();
        int today1 = today.nextInt(31);
        System.out.println(amountofDays);
        System.out.println(today1);
        if(amountofDays + today1 > 31){
            System.out.println("Bruh");
        }
        else System.out.println("YES!!!!!!!!");

        //Дальше вообще другое ГИПЕРСЛОЖНОЕ ЗАДАНИЕ!!!
        Random rand2 = new Random();
        int age = rand2.nextInt(140);
        System.out.println(age);
        if(age<=18 && age>=10){
            System.out.println("YES!!!!");
        }
        else System.out.println("Bruh");
        //дальше без брухов


    }
}
