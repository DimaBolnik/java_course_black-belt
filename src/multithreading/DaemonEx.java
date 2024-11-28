package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        UserThread ut = new UserThread();
        ut.setName("User Thread");
        DeamonThread deamon = new DeamonThread();
        deamon.setName("Deamon Thread");
        deamon.setDaemon(true);
        deamon.start();
        ut.start();
        System.out.println("Main thread ended");
    }
}

class UserThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'a'; i <= 'z'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DeamonThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
