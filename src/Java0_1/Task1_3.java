package Java0_1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        double x, y;
        System.out.println("введи x, y");
        Scanner sx = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);

        x = sx.nextDouble();
        y = sy.nextDouble();

        double z = ((Math.sin(x))+Math.cos(y)/((Math.cos(x)-Math.sin(y)))*Math.tan(x*y));
        System.out.println(z);
    }
}
