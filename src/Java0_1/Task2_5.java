package Java0_1;
//вычислить значение функции

import java.util.Scanner;
public class Task2_5 {

    public static void main(String[] args) {
        double f = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("введи значение Х");
        double x = sc.nextDouble();

        if (x<=3){
            f=((x*x)-3*x+9);
        }else {
            f= 1/(Math.pow(x,3)+6);
        }
        System.out.println("F(x) = " + f);

}
}