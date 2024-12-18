package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnable2 runnable = new MyRunnable2();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }

}


class Counter2 {
    static int count = 0;
}

class MyRunnable2 implements Runnable {

    private void doWork2() {
        System.out.println("Uraaaa!");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}


