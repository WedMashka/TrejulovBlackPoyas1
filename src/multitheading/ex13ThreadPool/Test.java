package multitheading.ex13ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    static final Object lock =new Object();
    static volatile int cou = 0;
    public static void main(String[] args) {
        Thread t =new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (Test.lock){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Test.cou++;
                    System.out.println(Thread.currentThread().getName() + " " + Test.cou);
                }
            }
        });
        ExecutorService executServ = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executServ.execute(t);
        }
        try {
            executServ.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executServ.shutdown();
        System.out.println("main End");
    }
}
