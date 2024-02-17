package multitheading.ex8Monitor;

public class Test8 {


    public static void main(String[] args) throws InterruptedException {
        CounterIncreament cI = new CounterIncreament();

        Thread t = new Thread(cI);
        Thread t2 = new Thread(cI);
        Thread t3 = new Thread(cI);

        t.start();
        t2.start();
        t3.start();


        System.out.println(CouterI.count);

    }

}
class CouterI{
    public static volatile int count = 0;
}


 class CounterIncreament implements Runnable{

     public  void incr(){
         synchronized(this){
             CouterI.count++;
             System.out.println(CouterI.count +  " From method " + Thread.currentThread().getName());
         }

     }
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             incr();
             //System.out.println(CouterI.count +  " From run " + Thread.currentThread().getName());
         }
     }
 }
