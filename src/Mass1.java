import java.util.Scanner;

public class Mass1 {
    public static void main(String[] args) {
        //1
        int[] artrayOfInts = new int[10];
        for (int i = 0; i < artrayOfInts.length; i++) {
            artrayOfInts[i] = i + 1;
        }
        for (int current : artrayOfInts) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //2
        int[] artrayOfInts2 = new int[10];
        artrayOfInts2[0] = 2;
        for (int i = 1; i < artrayOfInts2.length; i++) {
            artrayOfInts2[i] = artrayOfInts2[i - 1] + 2;
        }
        for (int current : artrayOfInts2) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //3
        int[] artrayOfInts3 = new int[10];
        artrayOfInts3[0] = 1;
        for (int i = 1; i < artrayOfInts3.length; i++) {
            artrayOfInts3[i] = artrayOfInts3[i - 1] + 2;
        }
        for (int current : artrayOfInts3) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //4
        int[] artrayOfInts4 = new int[10];
        for (int i = 0; i < artrayOfInts4.length; i++) {
            if (i % 2 == 0) {
                artrayOfInts4[i] = 1;
            } else {
                artrayOfInts4[i] = -1;
            }
        }
        for (int current : artrayOfInts4) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //5
        int[] artrayOfInts5 = new int[10];
        artrayOfInts5[0] = 1;
        for (int i = 1; i < artrayOfInts5.length; i++) {
            if (i % 2 == 0) {
                artrayOfInts5[i] = -artrayOfInts5[i - 1] + 1;
            } else {
                artrayOfInts5[i] = -artrayOfInts5[i - 1] - 1;
            }
        }
        for (int current : artrayOfInts5) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //6
        int[] artrayOfInts6 = new int[10];
        artrayOfInts6[0] = 1;
        artrayOfInts6[1] = 1;
        for (int i = 2; i < artrayOfInts6.length; i++) {
            artrayOfInts6[i] = artrayOfInts6[i - 1] + artrayOfInts6[i - 2];
        }
        for (int current : artrayOfInts6) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //7
        int[] artrayOfInts7 = new int[10];
        artrayOfInts7[0] = 1;
        for (int i = 1; i < artrayOfInts7.length; i++) {
            artrayOfInts7[i] = artrayOfInts7[i - 1] * (i + 1);
        }
        for (int current : artrayOfInts7) {
            System.out.println(current);
        }
        System.out.println();
        System.out.println();
        //last
        int[] artrayOfIntsl = new int[10];
        artrayOfInts5[0] = 1;
        for (int i = 1; i < artrayOfIntsl.length; i++) {
            if (i % 2 == 0) {
                artrayOfIntsl[i] = -artrayOfIntsl[i - 1] + 1;
            } else {
                artrayOfIntsl[i] = -artrayOfIntsl[i - 1] - 1;
            }
        }
        for (int current : artrayOfIntsl) {
            System.out.println(current);
        }
        //Второе большое задание, весёлое, позитивное
        System.out.println("Enter amount of elements:");
        Scanner scan1 = new Scanner(System.in);
        int elem = scan1.nextInt();
        int[] mass1 = new int[elem];
        System.out.println("Now, please, enter nums:");
        for (int i = 0; i < elem; i++) {
            Scanner lscan = new Scanner(System.in);
            int locel = lscan.nextInt();
            mass1[i] = locel;
        }
        int maks = mass1[0];//здесь ищем максмальный элемент
        int maksel = 0;
        for (int i = 0; i < elem; i++) {
            if (mass1[i] > maks) {
                maks = mass1[i];
                maksel = i;
            }
        }
        System.out.println(maks);//вывели максимальный элемент


        int min = mass1[0];//здесь ищем минимальный элемент
        int minel = 0;
        for (int i = 0; i < elem; i++) {
            if (mass1[i] < min) {
                min = mass1[i];
                minel = i;
            }
        }
        System.out.println(min);//вывели минималный элемент

        //теперь среднее арифметическое
        float sr = 0;
        for (int i = 0; i < mass1.length; i++) {
            sr = sr + mass1[i];
        }
        sr = sr / mass1.length;
        System.out.println("sr: " + sr);//вывели среднее арифметическое

        //теперь количество элементов между минимальным и максимальпным элементом
        if (mass1.length > 1) {
            System.out.print("Kolvoitd: ");
            System.out.println(Math.abs(maksel - minel) - 1);
        }


        //первое простое число
        int b = 0;
        for (int i = 0; i < mass1.length; i++) {
            System.out.println("я сюда зашел");
            if (mass1[i] == 2) {
                System.out.println("и сюда");
                System.out.println("2");
                break;//до этого момента всё правильно
            }
            else if (mass1[i] > 2){
                for (int j = 0; j*j < mass1[i]; j++) {
                    System.out.println("Da.");
                }







            }
        }
    }
}