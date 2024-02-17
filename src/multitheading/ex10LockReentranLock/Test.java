package multitheading.ex10LockReentranLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Call call = new Call();

        Thread mob = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread skype = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread whatsapp = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsappCall();
            }
        });
        mob.start();
        skype.start();
        whatsapp.start();

    }
}
//------------------------------------------
class Call {
    private Lock lock = new ReentrantLock();

    public void mobileCall(){
        lock.lock();{
            try {
                System.out.println("Mobile call start +++++++++++++++");
                Thread.sleep(5000);
                System.out.println("Mobile call finish -----------------------------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

    public void whatsappCall(){
        lock.lock();{
            try {
                System.out.println("whatsapp call start +++++++++++++++");
                Thread.sleep(9000);
                System.out.println("whatsapp call finish -----------------------------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }

        }
    }
    public void skypeCall(){
        lock.lock();{
            try {
                System.out.println("skype call start +++++++++++++++");
                Thread.sleep(5000);
                System.out.println("skype call finish -----------------------------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

}