import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_07 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        System.out.println(q1);
    }
}

// Methods of deque interface
//1. AddElement-- add()