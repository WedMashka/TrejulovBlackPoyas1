package multitheading.ex2;

public class TestSetName {
    public static void main(String[] args) {
        Thread m2 = new Thread( new MyThread2());

        m2.setName("Thread  my thread2");
        m2.setPriority(8);

        System.out.println(m2.getName() + "  /"+ m2.getPriority());
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(" i am  MyThread2");
    }
}