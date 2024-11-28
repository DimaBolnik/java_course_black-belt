package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}



class ThreadA extends Thread {

    public void run() {
        System.out.println("ТредA , попытка захватить монитор обьекта Lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("ТредA , монитор обьекта Lock1 захвачен");
            System.out.println("ТредA , попытка захватить монитор обьекта Lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("ТредA , мониторы обьектов Lock1 и Lock2 захвачены");
            }
        }
    }
}


class ThreadB extends Thread {

    public void run() {
        System.out.println("ТредB , попытка захватить монитор обьекта Lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("ТредB , монитор обьекта Lock2 захвачен");
            System.out.println("ТредB , попытка захватить монитор обьекта Lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("ТредB , мониторы обьектов Lock2 и Lock1 захвачены");
            }
        }
    }
}