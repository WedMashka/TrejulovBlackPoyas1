package multitheading.ex15ScheduledExecutorService;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    static final Object lock = new Object();
    public static void main(String[] args) {
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Start " + LocalTime.now());
                System.out.println(Thread.currentThread().getName() + " Finish " + LocalTime.now());

            }
        });

        ScheduledExecutorService schExSr = Executors.newScheduledThreadPool(2);

        for (int i = 0; i < 10; i++) {
            //System.out.println("schedule start " + LocalTime.now());
            schExSr.schedule(tr,3, TimeUnit.SECONDS);//задает задержку перед выполнением

        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("schedule start " + LocalTime.now());
//            schExSr.schedule(tr,3, TimeUnit.SECONDS);//задает задержку перед выполнением
//        }
//
        schExSr.scheduleAtFixedRate(tr,3,1,TimeUnit.SECONDS);//диапазон от начала до начала
      //  schExSr.scheduleWithFixedDelay(tr,3,1,TimeUnit.SECONDS) тоже самое только диапазон от конца до начала

        try {
            Thread.sleep(9000); // scheduleAtFixedRate() нужен для того что schExSr.shutdown(); не закрыл поток после первого завершения
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        schExSr.shutdown();


    }
}
