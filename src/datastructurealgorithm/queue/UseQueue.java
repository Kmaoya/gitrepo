package datastructurealgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {
    //Queue:FIFO order(First in first out)
    public static void main(String[] args) {

        Queue<String> name=new LinkedList<>();

        name.add("Kazi");//Head
        name.add("Denys");
        name.add("Karim");
        name.add("Hakim");
        name.add("Sami");//tall


        for (String st:name) {
            System.out.println(st);
        }
        System.out.println("After remove");

            name.remove("Kazi");

            for (String st:name) {
                System.out.println(st);
            }
            System.out.println("*********");
            System.out.println(name.element());
            System.out.println("*********");
            System.out.println(name.poll());
            System.out.println(name.poll());
            System.out.println("*********");
            System.out.println(name.remove());
            //peek and remove
            System.out.println(name.poll());
            //return
            System.out.println(name.peek());
            System.out.println(name.element());


        }



    }



