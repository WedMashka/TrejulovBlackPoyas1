package multitheading.ex11Deamon;

public class Test {
    public static void main(String[] args) {
        System.out.println(" main start");
        Thread t1 = new Thread(new Thread1());
        Thread daemon = new Thread(new Daemon1());
        daemon.setDaemon(true); //указали что поток демон  т.е. программе не нужно ждать его завершения
        daemon.setName("daemon");
        t1.setName("Past Tread");
        daemon.start();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" main finished");

    }
}
//--------------------------------------------------------------------------------

class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " start isDaemon = " + Thread.currentThread().isDaemon());
            for (char i = 'a'; i < 'e'; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +"  finished");
    }
}

class Daemon1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " start isDaemon = " + Thread.currentThread().isDaemon());
            for (int i = 0; i < 1000; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +"  finished");

    }
}