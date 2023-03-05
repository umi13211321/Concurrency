public class Sleep_1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sleep_1 t1 = new Sleep_1();
        Sleep_1 t2 = new Sleep_1();

        t1.start();
        t2.start();
    }
}
