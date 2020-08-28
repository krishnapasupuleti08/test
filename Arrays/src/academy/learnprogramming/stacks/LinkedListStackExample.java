package academy.learnprogramming.stacks;

import academy.learnprogramming.lists.Employee;

public class LinkedListStackExample {

    public static void main(String[] args) {

        Employee krishna = new Employee("Krishna", "Mohan",123);
        Employee aruna = new Employee("Aruna","Kumari",234);
        Employee bala = new Employee("Bala","Subramanyam",345);

        LinkedListStack stack = new LinkedListStack();

//        stack.push(krishna);
//        stack.push(aruna);
//        stack.push(bala);

        stack.printStack();
    }
}
