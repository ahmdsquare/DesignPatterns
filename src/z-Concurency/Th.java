package Concurency;

import java.lang.Thread;

public class Th extends Thread {

    Th() {
        setDaemon(true);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}