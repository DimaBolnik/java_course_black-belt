package multithreading;

public class Ex12 {
    final static Object lock = new Object();

    void mobileCallMethod() {
        synchronized (lock) {
            System.out.println("mobileCallMethod starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobileCallMethod ends");
        }
    }

    void skypeCallMethod() {
        synchronized (lock) {
            System.out.println("skypeCallMethod starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skypeCallMethod ends");
        }
    }

    void whatsappCallMethod() {
        synchronized (lock) {
            System.out.println("whatsappCallMethod starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsappCallMethod ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileCallThread());
        Thread thread2 = new Thread(new SkypeCallThread());
        Thread thread3 = new Thread(new WhatsappCallThread());
        thread1.start();
        thread3.start();
        thread2.start();
    }
}

class MobileCallThread implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCallMethod();
    }
}

class SkypeCallThread implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCallMethod();
    }
}

class WhatsappCallThread implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsappCallMethod();
    }
}
