package Java0_1;

import java.util.Scanner;

//Даны два угла треугольника, определить существует ли такой треугльник и если да то будет ли он прямоугльный.
public class Task2_1 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        System.out.println("Введи два угла");
        int angle1 = a1.nextInt();
        int angle2 = a2.nextInt();
         if (angle1 + angle2 < 179 ){
             System.out.println("треугольник сущетсвует");
             if (angle1 == 90 | angle2 == 90){
                 System.out.println("треугольник прямой");
             } else {
                 System.out.println("треугольник не прямой");
             }
         }else {
             System.out.println("такого треугольника не сущетсвует");
         }
    }
}
