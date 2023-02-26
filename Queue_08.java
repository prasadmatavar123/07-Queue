import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_08 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.addFirst(10);
        q1.addFirst(20);
        q1.addFirst(30);
        q1.addFirst(40);

        System.out.println(q1);
    }
}

//2. addFirst()