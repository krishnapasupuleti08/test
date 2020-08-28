package academy.learnprogramming.lists;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null){
            tail = node;
        }
        else{
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head;

        if(head.getNext() == null){
            tail = null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){

        if(isEmpty()){
           return false;
        }
        EmployeeNode current = head;

        while(current != null && !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
        }
        if(current == null){
           return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);

        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if(head == current){
            head = newNode;
        }
        else{
            newNode.getPrevious().setNext(newNode);
        }
        size++;
        return true;
    }
}
