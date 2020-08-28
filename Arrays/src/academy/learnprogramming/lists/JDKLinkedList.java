package academy.learnprogramming.lists;


import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedList {

    public static void main(String[] args) {
        Employee krishna = new Employee("Krishna", "Mohan",123);
        Employee aruna = new Employee("Aruna","Kumari",234);
        Employee bala = new Employee("Bala","Subramanyam",345);
        Employee thej = new Employee("Thej","Kalyan",456);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(krishna);
        list.addFirst(bala);
        list.addFirst(aruna);

        Iterator<Employee> itr = list.iterator();

        System.out.print("HEAD ->");
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
        list.add(thej);
        itr = list.iterator();
        System.out.println();
        System.out.print("HEAD ->");
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
    }
}
