package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(call::whatsappCall);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();;
        try {
            System.out.println("MobileCall starts");
            Thread.sleep(3000);
            System.out.println("MobileCall ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }


    void skypeCall() {
        lock.lock();;
        try {
            System.out.println("skypeCall starts");
            Thread.sleep(4000);
            System.out.println("skypeCall ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();;
        try {
            System.out.println("whatsappCall starts");
            Thread.sleep(5000);
            System.out.println("whatsappCall ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}
