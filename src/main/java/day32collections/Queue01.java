package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
       "Queue" larda ilk gelen ilk isleme girer.(First In First Out ==> FIFO)
       Bazen de son gelen ilk isleme girer.(Last In First Out ==> LIFO)
       "Deque" ==> "Double Ended Queue" hem FIFO hem LIFO için kullanılabilir

       "Deque" interface dir, constructor'ı yoktur, obje oluştururken(new'den sonra) kullanılamaz.
       new den sonra LinkedList veya PriorityQueue kullanılır.
 */
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList();
        queue.add("milk");
        queue.add("butter");
        queue.add("jam");
        queue.add("egg");
        queue.add("water");

        System.out.println("queue = " + queue); // [milk, butter, jam, egg, water]

        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty
        queue.poll(); // cut-paste  -  boşsa null

        queue.remove(); // cut-paste  -  boşsa exception

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        queue.peek(); // copy-paste  -  boşsa null

        //Retrieves, but does not remove, the head of this queue.
        //This method differs from peek only in that it throws on exception if this queue is empty.
        //Throws: NoSuchElementException - if this queue is empty
        queue.element(); // copy-paste  -  boşsa exception

        boolean isAdded = queue.offer("Avocado"); // kısıtlama varsa eklemez - add ekler  (eklerse:true, eklemezse:false)
        System.out.println(queue); // [jam, egg, water, Avocado]
        System.out.println(isAdded);

        Queue<String> queue2 = new PriorityQueue<>(); // PriorityQueue --> random order veya özelleştirilmiş sıra
        queue2.add("Milk");
        queue2.add("Butter");
        queue2.add("Jam");
        queue2.add("Egg");
        queue2.add("Luxury water");

        System.out.println(queue2); // [Butter, Egg, Jam, Milk, Luxury water]
    }
}
