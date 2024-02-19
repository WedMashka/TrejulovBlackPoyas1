package multitheading.laboratornaya.lab2;

public class Test {
    public static void main(String[] args) {
        RunnableCdildren r = new RunnableCdildren();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

    }
}

class RunnableCdildren implements Runnable{
    int counter =0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%10==0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ++counter;
                System.out.println(Thread.currentThread().getName()+" The desired number "+counter+" = " +i+  "The condition was " +i+ "/ 10 = 0");
            }
        }
    }
}
