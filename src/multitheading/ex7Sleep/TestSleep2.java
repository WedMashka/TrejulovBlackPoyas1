package multitheading.ex7Sleep;

public class TestSleep2 extends Thread{

    @Override
    public void run() {
        super.run();
        Thread.currentThread().setName("TestSleep2 run thread");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        TestSleep2 tS2 = new TestSleep2();
        Thread thr = new Thread(new MyThread4());

        tS2.start();
        thr.start();

        System.out.println("Start " +  Thread.currentThread().getName());
    }

}



class MyThread4 implements Runnable{
    public void run() {
        Thread.currentThread().setName("MyThread4 run thread");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }
}
