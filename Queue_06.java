import java.util.LinkedList;
import java.util.Queue;

public class Queue_06 {
    public static void main(String[] args) {
        Queue<Integer> l1 = new LinkedList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);

        System.out.println(l1.poll());
    }
}
 // Remove using poll methods