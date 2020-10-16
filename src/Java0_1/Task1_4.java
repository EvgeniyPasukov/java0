package Java0_1;

//дано число типа R вида nnn.ddd. Поменять значение дробной и целой части местами

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи число типа nnn.ddd");
        double num = sc.nextDouble();
        double ostatok = (num*1000)%1000;
        double celoe = (num-(num%1))/1000;
        double novoe = ostatok+celoe;

//        double x = sc.nextDouble();
//        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(novoe);
    }
}
