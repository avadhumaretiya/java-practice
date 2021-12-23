package dev.practice.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public Queue createQueue(){

        //Create a priority queue
        //Priority Queue provide default sorting but if we perform operation then it can vary
        //don't allow to insert a null value
        //Can be insert and remove from any location
        Queue<Integer> queue=new PriorityQueue<>();
        performOperationsOnQueue(queue);
        return queue;
    }

    public void performOperationsOnQueue(Queue queue){

        //peek() method
        //If queue is empty then return null
        System.out.println(queue.peek());

        //element() method
        //Same as peek but if queue is empty then it throws an exception
        //System.out.println(queue.element());

        for(int i=10;i<20;i++){
            //offer() method
            //use to insert elements in queue
            queue.offer(i);
        }

        System.out.println(queue);

        //poll() method
        //use to remove head og the queue
        System.out.println(queue.poll());

        //remove() method
        //use to remove
        //Same as poll() method but throws an exception if queue is empty
        System.out.println(queue.remove());

        System.out.println(queue);
    }
}
