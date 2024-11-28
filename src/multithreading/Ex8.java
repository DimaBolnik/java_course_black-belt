package multithreading;

public class Ex8 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Ex8 thread1 = new Ex8();
        Thread  thread2= new Thread(new MyRunnable1());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("konec");
    }
}



class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
