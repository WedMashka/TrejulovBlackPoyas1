package multitheading.ex6Volatile;

public class TestVolatale {
    public static void main(String[] args) {
        Thread m1 = new Thread(new Thread1());
        Thread m2 = new Thread(new Thread2());
        m1.start();
        m2.start();
    }
}




class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread1  start");
        long lon = (long) 0;
        while (BolValue.isStartFinish()){
            lon++;
        }
        System.out.println("Thread1 Finish lon =  " + lon);

    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread2 start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BolValue.setStartFinish();
        System.out.println(" Thread2 change variable StartFinish");


    }
}

class BolValue{
     static private volatile boolean startFinish = true;

    public static boolean isStartFinish() {
        return startFinish;
    }

    public static void setStartFinish() {
        if(BolValue.isStartFinish()){
            BolValue.startFinish = false;
        }else {
            BolValue.startFinish = true;
        }
    }
}
