import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_14 {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        
        System.out.println(q1.pop());
        System.out.println(q1.poll());
    }
}

//Remove element
//1. pop()-- remove first