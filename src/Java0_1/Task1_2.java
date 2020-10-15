package Java0_1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("введи a, b, c");
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        a = sa.nextDouble();
        b = sb.nextDouble();
        c = sc.nextDouble();

        double z = ((b + Math.sqrt(b*b + 4*a*c))/2*a)-((Math.pow(a,3)*c)+Math.pow(b,-2));
        System.out.println(z);
    }
}
