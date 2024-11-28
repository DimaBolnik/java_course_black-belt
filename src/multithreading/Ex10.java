package multithreading;

public class Ex10 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }

}


class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {

    public synchronized void incrementCount() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            incrementCount();
        }
    }
}
