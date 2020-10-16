package Java0_1;

//Дано число Т(время в секундах), вывести значение в часах, минутах и секундах

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        System.out.println("Введи количество секунд");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sec = s%60;
        int m = ( s - sec )/60;
        int min = m%60;
        int h = (m - min)/60;
        int hour = h%24;

        System.out.println( hour +" часов " + min + "минут " + sec + "секунд ");

    }
}
