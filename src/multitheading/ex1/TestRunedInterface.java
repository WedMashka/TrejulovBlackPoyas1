package multitheading.ex1;

public class TestRunedInterface {
    public static void main(String[] args) {

       Thread m3 = new Thread(new MyThread3());
        Thread m2 = new Thread(new MyThread3());
        Thread m4 = new Thread(new MyThread4());
        Thread m1 = new Thread(new MyThread3());

        m4.start();
        m3.start();
        m2.start();
        m1.start();

        //итого получаем 5 параллельных потоков
        //main
        //m1
        //m2
        //m3
        //m4



    }
}

class MyThread{

}

class MyThread3 extends MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 extends MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

