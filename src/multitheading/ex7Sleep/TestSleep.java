package multitheading.ex7Sleep;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i >0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Go Go Go!!!");

    }
}
