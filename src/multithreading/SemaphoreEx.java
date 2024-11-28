package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        for (int i = 1; i < 6; i++) {
            new Person(String.valueOf(i), callBox);
        }
    }
}


class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        System.out.println("Пользователь " + name + " ждет своей очереди....");
        try {
            callBox.acquire();
            System.out.println(name + " пользуется телефонной будкой");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            callBox.release();
        }
    }
}