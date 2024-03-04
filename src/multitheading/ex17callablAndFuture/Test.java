package multitheading.ex17callablAndFuture;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {

        ExecutorService execute = Executors.newSingleThreadExecutor();
        FactorialTest faq = new FactorialTest(6);
        Future<Integer> res = execute.submit(faq);
        Integer result;
        try {
            System.out.println(" future get result? " + res.isDone());
            System.out.println("Нам не нужен эвейт терминейшен т.к благодаря фьюче поток заморожен пока фьюче е получит результат");
            result = res.get();
            System.out.println(" future get result? " + res.isDone());
            System.out.println("фиюче получил результат можна работать дальше");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            execute.shutdown();
        }
        System.out.println(result);
        System.out.println("я не выведусь пока фьюче не получит результат");

    }
}

class FactorialTest implements Callable<Integer>{

    int ratio;

    public FactorialTest(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public Integer call() throws Exception {
        if(ratio<=0){
            try {
                throw new Exception("Вы ввели не верное число ");
            }
            catch (Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
        int result = 1;
        for (int i = 1; i < ratio+1; i++) {
            Thread.sleep(1000);
            result = result * i;
        }
        return result;
    }
}

