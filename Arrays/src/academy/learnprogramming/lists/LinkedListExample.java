package academy.learnprogramming.lists;

public class LinkedListExample {

    public static void main(String[] args) {

        Employee krishna = new Employee("Krishna", "Mohan",123);
        Employee aruna = new Employee("Aruna","Kumari",234);
        Employee bala = new Employee("Bala","Subramanyam",345);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(krishna);
        list.addToFront(aruna);
        list.addToFront(bala);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
