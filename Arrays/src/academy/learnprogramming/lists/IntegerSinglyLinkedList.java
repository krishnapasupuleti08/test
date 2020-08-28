package academy.learnprogramming.lists;

public class IntegerSinglyLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value){
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }


    public void insertSorted(Integer value){
        if(head == null || head.getValue() >= value){
            addToFront(value);
            return;
        }
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while(current != null && current.getValue() < value){
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

    public void printList(){
        IntegerNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
