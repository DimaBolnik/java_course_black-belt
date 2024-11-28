package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
//        counter.incrementAndGet();
        counter.addAndGet(-5);
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnableImpl18());
        Thread t2 = new Thread(new MyRunnableImpl18());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}


class MyRunnableImpl18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}