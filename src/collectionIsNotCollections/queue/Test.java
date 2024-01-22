package collectionIsNotCollections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queuelist = new LinkedList<>();
        queuelist.add("monday");
        queuelist.add("tuesday");
        queuelist.add("wednesday");
        queuelist.add("thursday");
        queuelist.offer("thursday");//отличается от add тем что не выбросит exception  когда будет достигнуто ограничение по
        //колличеству эллементов, если таковое мы установим.

        System.out.println(queuelist);
        queuelist.remove();
        System.out.println(queuelist);
        queuelist.poll(); // отличается от remove тем что  если элементы заончились то не выбросит exception, а выбросит null
        System.out.println(queuelist);
//        System.out.println( queuelist.poll());
//        System.out.println( queuelist.poll());
//        System.out.println( queuelist.poll());
//        System.out.println( queuelist.poll());
        System.out.println(queuelist.element());
        System.out.println(queuelist.peek());




    }
}
