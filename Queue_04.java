
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;


public class Queue_04 {
    public static void main(String[] args) {
        Queue<Integer> q2 = new LinkedBlockingDeque<Integer>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        System.out.println(q2.remove());
        
        System.out.println(q2.remove());
        
    }
    
}
// Remove with the help of LinkedBlockingDeque