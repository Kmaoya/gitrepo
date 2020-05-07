package datastructurealgorithm.queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {
    //top element from priority queue: peek method onlypeek value from queue

   public static void main(String[] args) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      pq.add(30);
       pq.add(30);
       pq.add(30);
       pq.add(30);
       pq.add(30);
       pq.add(30);

       System.out.println(pq.peek());

       for (Integer num:pq) {
           System.out.println(num);

       }

       System.out.println("Using Pool Method");

       //Pool Method peek and remove
       System.out.println(pq.poll());

       for (Integer num:pq) {
           System.out.println(num);
       }


   }




}
