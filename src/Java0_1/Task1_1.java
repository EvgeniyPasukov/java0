package Java0_1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1_1 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("введи a, b, c");
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        a = sa.nextDouble();
        b = sb.nextDouble();
        c = sc.nextDouble();

        double z = ((a -3)*b/2)+c;
        System.out.println(z);

    }
}
