package multitheading.ex1;

public class Test1 {
    public static void main(String[] args) {

        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        MyThread2 m3 = new MyThread2();
        MyThread2 m4 = new MyThread2();
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

class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

