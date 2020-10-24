package Java0_1;
//заданы размеры A B прямоугольного отверстия и размеры x,y,z кирпича.
// Определить, пройдет ли кирпич через отверстие

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Введи размеры отверстия A,B");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int a1 = a.nextInt();
        int b1 = b.nextInt();

        System.out.println("Введи размеры кирпича x,y,z");
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int x1 = x.nextInt();
        int y1 = y.nextInt();

        if (a1 > x1 || b1 > y1){
            System.out.println("пройдет!");
        }else {
            System.out.println(" корпич больше отверстия!");
        }
    }
}
