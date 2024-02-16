package multitheading.ex1;

public class MultiThreadWithAnonimusClass {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi " + i);

                }
            }
        }).start();

        //or

        new Thread(()->{
            System.out.println("Good by");
        }).start();

        // итого 3 потока



    }
}
