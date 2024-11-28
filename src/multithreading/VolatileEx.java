package multithreading;

public class VolatileEx extends Thread {
    volatile boolean flag = true;


    @Override
    public void run() {
        long count = 0;
        while (flag) {
            count++;
        }
        System.out.println("VolatileEx count: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx t1 = new VolatileEx();
        t1.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is tame to weke up!");
        t1.flag = false;
        t1.join();
        System.out.println("End of program");
    }
}
