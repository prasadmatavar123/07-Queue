import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_17 {
    public static void main(String[] args) {
        Queue<Integer> d1 = new ArrayDeque<>();
        d1.add(100);
        d1.add(200);
        d1.add(300);
        d1.add(400);
         for(Integer item:  d1){
            System.out.println(item);
         }
    }
}

//Queue using for loop