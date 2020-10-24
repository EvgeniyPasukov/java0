package Java0_1;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("введи число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            System.out.println("число <0");
        }
    }
}
