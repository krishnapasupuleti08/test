package academy.learnprogramming.lists;

public class LinkedListChallenge {

    public static void main(String[] args) {
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerSinglyLinkedList list = new IntegerSinglyLinkedList();

        list.insertSorted(four);
        list.insertSorted(two);
        list.insertSorted(three);
        list.insertSorted(one);

        list.printList();
    }
}
