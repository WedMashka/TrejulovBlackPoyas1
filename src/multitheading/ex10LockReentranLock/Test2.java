package multitheading.ex10LockReentranLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        Person p = new Person(lock,"Din");
        Person p2 = new Person(lock,"Sem");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Person p3 = new Person(lock,"Kim");
        Person p4 = new Person(lock,"Yan");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Person p5 = new Person(lock,"bob");
        Person p6 = new Person(lock,"Frank");

    }
}

//---------------------------------------------------------------------

class Person extends Thread{
    Lock lock;
    String name;

    public Person(Lock lock, String name) {
        this.lock = lock;
        this.name = name;
        this.start();
    }

    @Override
    public void run() {
        if(lock.tryLock()){
            try {
                System.out.println(this.name + " wait");
                //lock.lock();
                Thread.sleep(3000);
                System.out.println(this.name + " withdrew from ATM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println(this.name + " did not wait and left");
        }


    }
}
