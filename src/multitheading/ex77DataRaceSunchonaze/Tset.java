package multitheading.ex77DataRaceSunchonaze;

public class Tset {
    public static void main(String[] args) {
        IncrCount1 icr = new IncrCount1();

        Thread icr1 = new Thread(icr);
        Thread icr2 = new Thread(icr);
        Thread icr3 = new Thread(icr);

        icr1.start();
        icr2.start();
        icr3.start();

    }
}

//--------

class Counter{
    static volatile  int count = 0;
}

//----

class IncrCount1 implements Runnable{

    public synchronized void incremetCount(){
        Counter.count++;
        System.out.print(Counter.count + ", ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            incremetCount();
        }
    }
}