import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_10 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);

        System.out.println(q1);
        

    }
}

//4. offer()