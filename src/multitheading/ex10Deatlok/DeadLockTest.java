package multitheading.ex10Deatlok;

public class DeadLockTest {
    static final Object lock = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new  Thread2();
//        Thread t11 = new Thread(t1);
//        Thread t22 = new Thread(t2);
//            t11.start();
//            t22.start();

        for (int i = 0; i < 1; i++) {
            Thread t11 = new Thread(t1);
            Thread t22 = new Thread(t2);
            t11.start();
            t22.start();

        }
    }
}

class Thread1 implements Runnable{
    public void tread1(){
        System.out.println("tread1 Try licked of monitor lock");
        synchronized (DeadLockTest.lock){
            System.out.println("tread1 Lock is locked");
            System.out.println("tread1 Try licked of monitor lock2");
            synchronized (DeadLockTest.lock2){
                System.out.println("tread1 Lock2 is locked");
            }
        }
    }



    @Override
    public void run() {
        tread1();
    }
}

class Thread2 implements Runnable{
    public void tread2(){
        System.out.println("tread2 Try licked of monitor lock2");
        synchronized (DeadLockTest.lock){
            System.out.println("tread2 Lock2 is locked");
            System.out.println("tread2 Try licked of monitor lock");
            synchronized (DeadLockTest.lock2){
                System.out.println("tread2 Lock is locked");
            }
        }
    }
    @Override
    public void run() {
        tread2();
    }
}

