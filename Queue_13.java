import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_13 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.push(40);

        System.out.println(q1);
    }
}

// 7. push()