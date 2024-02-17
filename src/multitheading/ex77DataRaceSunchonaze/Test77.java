package multitheading.ex77DataRaceSunchonaze;

public class Test77 {
   volatile static int count = 0;
    static synchronized public void counter(){Test77.count++;}

    public static void main(String[] args) {
        Thread n = new Thread(new Kia());
        Thread n2 = new Thread(new Kia());
        n.start();
        n2.start();
        try {
            n.join();
        } catch (InterruptedException e) {
            System.out.println(e.fillInStackTrace());
        }
        try {
            n2.join();
        } catch (InterruptedException e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println(count);
    }
}

class Kia implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Test77.counter();
            System.out.println(Test77.count + ", " + Thread.currentThread().getName());
        }

    }
}