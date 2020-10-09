package examples;

class somethread extends Thread {
    public void run(){
        for (int i = 0; i<10; i++)
            System.out.println("number = " + i);
    }
}

    public class thread {
        public static void main(String[] args) {
            somethread test = new somethread();
            test.start();

            somethread test1 = new somethread();
            test1.start();

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i<10; i++)
                        System.out.println("number = " + i);
                }
            });
            t1.start();
        }

    }
