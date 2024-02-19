package multitheading.laboratornaya.lab3;

public class Test {
    static volatile StringBuilder strB  = new StringBuilder();

    static void changeToNextSumbol(){
        synchronized (Lock.lock){
            for (char i = 'a'; i < 'z'; i++) {
                strB.append(i);
                System.out.println(Thread.currentThread().getName() + " "+ strB);
            }
        }
    }
    static void changeToNextSumbol2(){
        synchronized (Lock.lock){
            for (char i = 'a'; i < 'z'; i++) {
                strB.append(i);
                System.out.println(Thread.currentThread().getName() + " "+ strB);
            }
        }
    }
    public static void main(String[] args) {
        strB.append((char) 97);
        System.out.println(strB);
        strB.replace(0,strB.length(), ""+(char)98);
        System.out.println(strB);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                changeToNextSumbol();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                changeToNextSumbol2();
            }
        });

        t1.start();
        t2.start();


    }
}
//--------------------------------------------------------------------
class Lock{
    public static final Object lock = new Object();
}


