package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

        thread.join();

        System.out.println("Main thread ends");
    }
}


class InterruptedThread extends Thread {
    double sqrt = 0;

    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if(isInterrupted()){
                System.out.println("Thread interrupted");
                System.out.println(sqrt);
                return;
            }
            sqrt += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток спал и его прервали, давайте завершим его работу");
                System.out.println(sqrt);
                return;
            }
        }
        System.out.println(sqrt);
    }
}
