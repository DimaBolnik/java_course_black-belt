package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Dima", lock);
        new Employee("Marina", lock);
        Thread.sleep(3000);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);

    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " ждем....");
//            lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(1000);
                System.out.println(name + " завершил свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " не хочет здать в очереди");
        }
    }
}
