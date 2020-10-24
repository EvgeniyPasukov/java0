package Java0_1;
//определить находятся ли точки A B,C на одной прямой;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        System.out.println("Введи координаты точки А: x1, y1");
        Scanner x1 = new Scanner(System.in);
        Scanner y1 = new Scanner(System.in);
        int tx1 = x1.nextInt();
        int ty1 = y1.nextInt();

        System.out.println("Введи координаты точки B: x2, y2");
        Scanner x2 = new Scanner(System.in);
        Scanner y2 = new Scanner(System.in);
        int tx2 = x2.nextInt();
        int ty2 = y2.nextInt();

        System.out.println("Введи координаты точки C: x3, y3");
        Scanner x3 = new Scanner(System.in);
        Scanner y3 = new Scanner(System.in);
        int tx3 = x3.nextInt();
        int ty3 = y3.nextInt();

        if (tx1 == tx2 && tx1 == tx3 && tx2 == tx3) {
            System.out.println("точки A=B=C по оси х");
        } else if (ty1== ty2 && ty1 == ty3 && ty2 == ty3) {
            System.out.println("точки A=B=C по оси y");
        }else {
            System.out.println("нет точек на одной прямой");
        }

    }
}

