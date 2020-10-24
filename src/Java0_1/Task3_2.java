package Java0_1;
//вычислить значение функции на отрезке [a,b] с шагом h;

public class Task3_2 {
    public static void main(String[] args) {
        int a,b;
        double y,x,dx;

        a=0;
        b=5;
        dx=0.5;
        for (x=a;x<=b-dx;x+=dx )
        {
            System.out.print("x= " +x+",");
            if (x<=2){
                y = -x *dx;
                System.out.println("y ="+y);
            }
            else if (x>2){
                y =x;
                System.out.println("y ="+y);

            }
        }

    }
}
