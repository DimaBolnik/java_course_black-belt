package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("Threaddd");
        thread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Имя потока = " + thread5.getName());
        System.out.println(thread5.getPriority());
        thread5.start();
    }

}


class MyThread5 extends Thread {

    @Override
    public void run() {
        System.out.println("Privet");
    }
}