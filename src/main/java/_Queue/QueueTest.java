package _Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {


        _Queue<String> queue = new _Queue<String>();

        queue.add("first");
        queue.add("second");
        queue.add("third");

        while(!queue.empty()){
            System.out.println(queue.remove());
        }

        queue.add("fourth");
        while(!queue.empty()){
            System.out.println(queue.remove());
        }

    }
}
