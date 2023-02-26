import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Queue_05 {
    public static void main(String[] args) {
        Queue<Integer> q2 = new ConcurrentLinkedDeque<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        System.out.println(q2.remove());
    }
}

//Remove with the help of ConcurrentLinkedDeque