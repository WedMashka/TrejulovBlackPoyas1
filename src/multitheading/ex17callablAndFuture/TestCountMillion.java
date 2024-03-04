package multitheading.ex17callablAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;

public class TestCountMillion {

    public static long value = 1_000_000_000L;
    public static long sum = 0L;

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(10);
        List<Future<Long>> list_result = new ArrayList<>();
        long value = TestCountMillion.value/10;
        for (int i = 0; i < 10; i++) {
            long from = value * i+1;
            long to = value *(i+1);
            PartialSum pSum = new PartialSum(from,to);
            Future<Long> futurePartSum = executors.submit(pSum);
            list_result.add(futurePartSum);
        }
        for (int i = 0; i < list_result.size(); i++) {
            try {
                sum = sum + list_result.get(i).get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executors.shutdown();
        System.out.println(sum);


//
    }
}

class PartialSum implements Callable<Long>{
    long from;
    long to;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    long localSum;

    @Override
    public Long call() throws Exception {
        for (long i = from; i < to; i++) {
            localSum +=i;
        }

        System.out.println("сумма от " + from + " до "+ to + " = " +localSum);
        return localSum;
    }
}



