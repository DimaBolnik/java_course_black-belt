package multithreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(8);
        Future<Integer> submit = executorService.submit(factorial2);
        try {
            System.out.println(submit.isDone());
            System.out.println("Хотим получить результат");
            factorialResult =submit.get();
            System.out.println("Получили результат");
            System.out.println(submit.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer> {
    int f;
    public Factorial2(int f) {
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(300);
        }
        return result;
    }
}
