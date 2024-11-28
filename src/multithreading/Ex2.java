package multithreading;

public class Ex2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ex2 ex = new Ex2();
        ex.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }




//        MyThread1 tr1 = new MyThread1();
//        MyThread1 tr2 = new MyThread1();
//        tr1.start();
//        tr2.start();

    }

}


//class MyThread1 extends Thread {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//
//    @Override
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}