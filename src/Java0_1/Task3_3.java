package Java0_1;
//сумма квадратов первых ста чисел;
public class Task3_3 {
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;
        for (int i = 0; i<=100; ++i){
            temp = i*i;
            sum += temp;
            System.out.println( i + "=" + temp);

        }
        System.out.println( sum);
    }
}
