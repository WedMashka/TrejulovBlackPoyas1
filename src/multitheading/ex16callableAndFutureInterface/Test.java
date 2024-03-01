package multitheading.ex16callableAndFutureInterface;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {

        ExecutorService execut2 = Executors.newCachedThreadPool();

        Future<Integer> futureInt = execut2.submit(new Factorial2(6));

        try {
            System.out.println(futureInt.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        finally {
            execut2.shutdown();
        }


    }
}

class Factorial2 implements Callable<Integer>{
    int f1;
    public Factorial2(int f1){
        this.f1 = f1;
    }
    @Override
    public Integer call() throws Exception {

        if (f1<=0){
            try {
                throw new Exception();
            }catch (Exception e){
                System.out.println(e.fillInStackTrace() + " Enter Wrong number");
            }
        }

        int res = 1;
        for (int i = 1; i <= f1; i++) {
            res*=i;
        }

        return res;
    }
}

