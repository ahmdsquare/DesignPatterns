package Concurency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // for (int i = 0; i <= 5; i++) {
        // Th th = new Th(i);
        // th.start();

        // try {
        // System.out.println(th.getId()); // wait till the first thread ends
        // if (i == 3) {
        // th.setDaemon(true);
        // }
        // } catch (Exception IllegalMonitorStateException) {
        // System.out.println("IllegalMonitorStateException");
        // }

        // }
        Th th = new Th();

        th.start();
        th.join();

        System.out.println(th.isAlive());
        // Th th = new Th(0);
        // Th th1 = new Th(0);
        // th.setPriority(1);
        // th1.setPriority(10);
        // th.start();
        // th1.start();
        // System.out.println(th.getId());
    }
}