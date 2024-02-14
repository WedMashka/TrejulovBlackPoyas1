package multitheading.ex2;

public class NestGetName {
    public static void main(String[] args) {
        Thread m1 = new Thread(new MyThread1());
        Thread m2 = new Thread(new MyThread1());
        Thread m3 = new Thread(new MyThread1());

        System.out.println("name thead is "+ m1.getName() + " priority is " + m1.getPriority());
        System.out.println("name thead is "+ m2.getName() + " priority is " + m2.getPriority());
        System.out.println("name thead is "+ m3.getName() + " priority is " + m3.getPriority());
    }

}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println(" I am class MyThread1 implements Runnable");
    }
}