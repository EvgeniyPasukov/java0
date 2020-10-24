package Java0_1;
//найти max{min(a,b) , min(c,d)};

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Введи точку а");
        int a = sa.nextInt();

        Scanner sb = new Scanner(System.in);
        System.out.println("Введи точку b");
        int b = sb.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи точку c");
        int c = sc.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.println("Введи точку d");
        int d = sd.nextInt();

        if (a>c || b>d){
            System.out.println("min1 > min 2");
        } else if (a<c || b<d){
            System.out.println("min2 > min1");
        } else {
            System.out.println("min1 = min 2");
        }
    }
}
