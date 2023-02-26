import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_11 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offerFirst(10);
        q1.offerFirst(20);
        q1.offerFirst(30);
        q1.offerFirst(40);

        System.out.println(q1);
    }
}

//5. offerFirst()