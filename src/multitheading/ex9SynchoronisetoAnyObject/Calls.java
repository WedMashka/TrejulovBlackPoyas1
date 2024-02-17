package multitheading.ex9SynchoronisetoAnyObject;

public class Calls {
    static final Object lock = new Object();

    //static Marker m = new Marker();
    public static void mobileCall(){
        synchronized (lock){
            System.out.println("Mobile call start");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call finish");

        }
    }
//-
    public static void skypeCall(){
        synchronized (lock){
            System.out.println("Skype call start");

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call finish");

        }
    }
//-
    public static void whatsappCall(){
        synchronized (lock){
            System.out.println("Whatsapp call start");

            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call finish");

        }
    }

    //-
    public static void main(String[] args) {
        Thread m = new Thread(new Mobile());
        Thread s = new Thread(new Whatsapp());
        Thread w = new Thread(new Skype());
        m.start();
        s.start();
        w.start();
    }

}
//-----
//class Marker{}
//-----
class Whatsapp implements Runnable{
    @Override
    public void run() {
        Calls.whatsappCall();
    }
}
//-----
class Mobile implements Runnable{
    @Override
    public void run() {
        Calls.mobileCall();
    }
}
//-----
class Skype implements Runnable{
    @Override
    public void run() {
        Calls.skypeCall();
    }
}