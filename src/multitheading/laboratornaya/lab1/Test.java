package multitheading.laboratornaya.lab1;

public class Test {
    public static void main(String[] args) {
        newThread t1 =new newThread();
        t1.start();

    }
}
//------------------------------------------------------------------------
class newThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("Conclusion number " + (i+1));
        }
    }
}
