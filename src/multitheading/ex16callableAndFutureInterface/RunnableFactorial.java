package multitheading.ex16callableAndFutureInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static volatile int  faclorialResult1;

    public static void main(String[] args) {
        Factorial1 f1 = new Factorial1(7);
//        Thread t1 = new Thread(f1);
//        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        ExecutorService execut1 = Executors.newSingleThreadExecutor();
        execut1.execute(f1);
        execut1.shutdown();
        try {
            execut1.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(RunnableFactorial.faclorialResult1);

    }
}

class Factorial1 implements Runnable{
    public Factorial1( int f1){
        this.f1 = f1;
    }
    int f1;
    @Override
    public void run() {
        if(f1<=0){
            System.out.println("You entered wrong number");
            return;
        }

        int res = 1;
        for (int i = 1; i < f1; i++) {
            res = res*i;
        }
        RunnableFactorial.faclorialResult1 = res;
    }
}
