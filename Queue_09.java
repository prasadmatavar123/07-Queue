import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_09 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.addLast(10);
        q1.addLast(20);
        q1.addLast(30);
        q1.addLast(40);

        System.out.println(q1);
    }
}

//3. addLast()