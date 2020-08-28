package academy.learnprogramming.queues;

import academy.learnprogramming.lists.Employee;

public class QueueExample {

    public static void main(String[] args) {
        Employee krishna = new Employee("Krishna", "Mohan",123);
        Employee aruna = new Employee("Aruna","Kumari",234);
        Employee bala = new Employee("Bala","Subramanyam",345);
        Employee thej = new Employee("Thej","Kalyan",456);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(krishna);
        queue.add(aruna);
        queue.add(bala);
        queue.add(thej);

        queue.printQueue();

        System.out.println("=======================");

        queue.printQueue();

        System.out.println("=======================");

        System.out.println(queue.peek());
    }


}
