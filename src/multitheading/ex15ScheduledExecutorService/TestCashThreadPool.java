package multitheading.ex15ScheduledExecutorService;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestCashThreadPool {
    static final Object lock = new Object();
    public static void main(String[] args) {
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Start " + LocalTime.now());
                System.out.println(Thread.currentThread().getName() + " Finish " + LocalTime.now());

            }
        });

        ExecutorService schExSr = Executors.newCachedThreadPool();//автоматически создает новые потоки в соответствии с поступающими тасками

        for (int i = 0; i < 50; i++) {
            schExSr.execute(tr);
        }

        schExSr.shutdown();

    }
}
