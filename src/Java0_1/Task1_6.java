package Java0_1;

import java.util.Scanner;

//напечатать true если точка приналежит закрашенной области
public class Task1_6 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);
        System.out.println("Введи значение x");
        double x = sx.nextDouble();
        System.out.println("Введи значение y");
        double y = sy.nextDouble();
        if (y>4 || y<0 || x>4 || x<-4){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
