import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //лучшая программа для забывчивых сэлкэшей
        Scanner scan1 = new Scanner(System.in);
        String time = scan1.nextLine();
        int hours = Integer.parseInt(time.substring(0,1));
        int minutes = Integer.parseInt(time.substring(3,4));
        System.out.println("time:" + hours + ":" + minutes);
        if(hours < 0 || minutes < 0) {
            System.out.println("Вводи нормальные числа!!!");
        }
        else if(hours >= 0){
            if(hours >= 24 || minutes >= 60) {
                System.out.println("Вводи нормальные числа!!!");
            }
        }
        else{
            if(hours == 8 && minutes >= 0){
                if(minutes <30){
                    System.out.println(" WAKE UP!!!!!!!!!!!!!");
                }
            }
            if(hours == 8 && minutes >= 30 ){
                System.out.println("zaradka");
            }
            if(hours == 9 && minutes < 40){
                System.out.println("zavtrak");
            }
            if(hours == 9 && minutes >= 40){
                System.out.println("TT");
            }
            if(hours >=10 && hours < 13){
                System.out.println("studying");
            }
            if(hours >= 13 && hours < 14){
                System.out.println("OBED");
            }
            if(hours >= 14 && hours <16){
                System.out.println("MK");
            }
            if(hours == 16 && minutes <30){
                System.out.println("POLDNIK");
            }
            if(hours == 16 && minutes >=30){
                System.out.println("TW");
            }
            if(hours == 17){
                System.out.println("TW");
            }
            if(hours == 18 && minutes < 30){
                System.out.println("TW");
            }
            if(hours == 18 && minutes >= 30){
                System.out.println("YYYYYYYYYYYYZDIN");
            }
            if(hours == 19){
                System.out.println("TW");
            }
            if(hours >= 20 && hours < 23){
                System.out.println("VECHERKA");
            }
            if(hours >= 23){
                System.out.println("SPAT");
            }
            if(hours < 8){
                System.out.println("SPAT");
            }
        }
    }
}