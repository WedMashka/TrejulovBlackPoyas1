package multitheading.ex12Interapt;

public class Test {
    public static void main(String[] args) {
        System.out.println(" main start");
        Thread t1 = new Thread(new TestInterrupt());
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       t1.interrupt();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" main finish");
    }
}

class TestInterrupt implements Runnable{
    double res = 0.0;
    @Override
    public void run() {
        System.out.println("TestInterrupt  start");
        for (int i = 0; i < 1000000000; i++) {
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Thread is interrupted");
                System.out.println(res);
                return;
            }

            res += Math.sqrt(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread try interrupt when thread is slipping");
                System.out.println(res);
                return;
            }

        }
        System.out.println(res);
        System.out.println("TestInterrupt  finish");
    }

}
