import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_12 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offerLast(10);
        q1.offerLast(20);
        q1.offerLast(30);
        q1.offerLast(40);

        System.out.println(q1);
    }
}

//6. offerLast()