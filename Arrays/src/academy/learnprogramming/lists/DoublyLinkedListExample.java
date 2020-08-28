package academy.learnprogramming.lists;

public class DoublyLinkedListExample {

    public static void main(String[] args) {
        Employee krishna = new Employee("Krishna", "Mohan",123);
        Employee aruna = new Employee("Aruna","Kumari",234);
        Employee bala = new Employee("Bala","Subramanyam",345);
        Employee thej = new Employee("Thej","Kalyan",456);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        employeeDoublyLinkedList.addToFront(krishna);
        employeeDoublyLinkedList.addToFront(aruna);
        employeeDoublyLinkedList.addToFront(bala);

        employeeDoublyLinkedList.printList();

        //employeeDoublyLinkedList.addToEnd(thej);

//        employeeDoublyLinkedList.removeFromFront();



        employeeDoublyLinkedList.addBefore(thej,krishna);

        employeeDoublyLinkedList.printList();


    }
}
