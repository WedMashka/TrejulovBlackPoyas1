package multitheading.ex9WaitNotify;

public class WaitNotifyExamle {
    public static void main(String[] args) {
        Market market = new Market();
        Thread manufacturer = new Thread(new Manufacturer(market));
        Thread consumer = new Thread(new Consumer(market));
        consumer.start();
        manufacturer.start();

    }
}
//---------------
class Market{

    private final Object lock = new Object();
    private volatile int bredValue =0;

    public  void getBread(){
        synchronized(lock){
            while(bredValue<1){// ваил а не иф потому что это рекомендация джава док
                try {
                    lock.wait();// говорим потребителю вызвавшему метод что нужно подождать(пока нет хлеба)(потребитель в ожидании)

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            bredValue--;
            System.out.println("The consumer bought 1 wheat bread. There are  "  +  bredValue +  " loaves left " );
            lock.notify(); //говорим производителю что освободилось место (будим производителя)
        }
    }
    //
    public  void putBread(){
        synchronized(lock) {
            while (bredValue >= 1000) {// ваил а не иф потому что это рекомендация джава док
                try {
                    lock.wait(); // (производителя в сон) того кто вызывает метод в сон отправляем
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            bredValue++;
            System.out.println("The manufacturer delivered 1 loaf. There are " + bredValue + " loaf");
            lock.notify();
        }
    }

}

//---------------

class Manufacturer implements Runnable{

    public Market market;

    public Manufacturer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            market.putBread();
        }
    }
}
//---------------
class Consumer implements Runnable{

    public Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            market.getBread();
        }
    }
}
