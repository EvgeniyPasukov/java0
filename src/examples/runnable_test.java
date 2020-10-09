package examples;

class  Some implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<10; i++)
            System.out.println("number = " + i);
    }
}

public class runnable_test {
    public static void main(String[] args) {
        Thread new_one = new Thread(new Some());
        Thread new_two = new Thread(new Some());

        new_one.start();
        new_two.start();

    }
}
